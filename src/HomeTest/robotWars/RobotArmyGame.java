package HomeTest.robotWars;

import java.util.*;
import java.util.concurrent.*;

public class RobotArmyGame {


    private static final int NUM_COUNTRIES = 4;
    private static final int PARTS_TO_COLLECT = 6;
    private static final int ROBOTS_TO_COLLECT = 2;
    private static final int TIME_TO_PRODUCE_PART = 500; // 5 секунд это вечность, пусть будет нано.

    public static void main(String[] args) throws InterruptedException {

        // Метод, чтобы управлять потоками, которые обрабатывают каждую страну.

        ExecutorService executor = Executors.newFixedThreadPool(NUM_COUNTRIES);
        // Создаем завод и n стран
        Factory factory = new Factory();
        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < NUM_COUNTRIES; i++) {
            Country country = new Country(factory, i + 1);
            countries.add(country);
            executor.execute(country);
        }



        // Подождите, пока одна из стран произведет достаточное количество роботов
        while (true) {
            for (Country country : countries) {
                if (country.getRobotCount() >= ROBOTS_TO_COLLECT) {
                    System.out.println("Country " + country.getId() + " wins!");
                    executor.shutdownNow(); // Все я наработался.
                    return;
                }
            }
            Thread.sleep(1000);
        }
    }
        // Класс фабрика, что хочу то, ворочу.
    private static class Factory {
        private final Random random = new Random();
        private final Map<RobotPart, Integer> parts = new HashMap<>();
            // Метод, создает детали (случайно).
        public synchronized RobotPart produceRandomPart() {
            try {
                Thread.sleep(TIME_TO_PRODUCE_PART);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); //  метод для "игры в пин-понг".
                return null;
            }
            RobotPart part = RobotPart.values()[random.nextInt(PARTS_TO_COLLECT)];
            parts.put(part, parts.getOrDefault(part, 0) + 1); // Смотрите я что, то нашел, оно нам подходит.
            System.out.println("Factory produces a " + part);
            return part;
        }
        // Метод synchronized возвращает копию Map parts, которая содержит доступные запчасти для роботов на заводе Factory.
        public synchronized Map<RobotPart, Integer> getAvailableParts() {
            return new HashMap<>(parts);
        }
    }
        //  Класс, который представляет собой страну, производящую роботов.
    private static class Country implements Runnable {
        private final int id;
        private final Factory factory;
        private final Map<RobotPart, Integer> parts = new HashMap<>();
        private int robotCount;

        public Country(Factory factory, int id) {
            this.factory = factory;
            this.id = id;
        }
        //    Метод  возвращает идентификатор страны.
            public int getId() {
            return id;
        }
        // Метод возвращает количество роботов, созданных страной.
        public int getRobotCount() {
            return robotCount;
        }
       //  Метод, который реализует основной цикл страны, в котором она собирает детали и собирает роботов.

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                RobotPart part = factory.produceRandomPart();
                collectParts(part);
                buildRobot();
            }
        }
        // Метод  добавляет деталь в коллекцию страны.
        private synchronized void collectParts(RobotPart part) {
            parts.put(part, parts.getOrDefault(part, 0) + 1);
            System.out.println("Country " + id + " collects a " + part);
        }
        // Метод проверяет, достаточно ли деталей для создания робота, и если это так, создает нового робота и увеличивает счетчик.
        private synchronized void buildRobot() {
            while (canProduceRobot()) {
                for (RobotPart part : RobotPart.values()) {
                    int count = parts.getOrDefault(part, 0);
                    if (count >= 2) {
                        parts.put(part, count - 2);
                    }
                }
                robotCount++;
                System.out.println("Country " + id + " builds a robot!");
            }
        }
        // Метод проверяет, можно ли собрать нового робота.

        private boolean canProduceRobot() {
            for (RobotPart part : RobotPart.values()) {
                if (parts.getOrDefault(part, 0) < 2) {
                    return false;
                }
            }
            return true;
        }
    }
        // Класс, который представляет собой типы деталей робота.
    public enum RobotPart {
        HEAD,
        BODY,
        RIGHT_ARM,
        LEFT_ARM,
        RIGHT_LEG,
        LEFT_LEG
    }
}

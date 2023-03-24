package HomeTest.robotWars5;

import java.util.ArrayList;
import java.util.List;

import static HomeTest.robotWars5.ConstantRoboArmy.ARMY_SIZE;
import static HomeTest.robotWars5.ConstantRoboArmy.PRODUCTION_TIME;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Country[] countries = new Country[ARMY_SIZE];
        for (int i = 0; i < ARMY_SIZE; i++) {
            countries[i] = new Country(factory);
        }
        Thread factoryThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(PRODUCTION_TIME);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        factoryThread.setDaemon(true);
        factoryThread.start();

        List<Thread> countryThreads = new ArrayList<>();
        long[] productionTimes = new long[ARMY_SIZE]; // массив для сохранения времени выполнения производства роботов в каждой стране
        for (int i = 0; i < countries.length; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                countries[index].buildArmy();
                productionTimes[index] = factory.getProductionTime(); // сохраняем время выполнения производства роботов в текущей стране
                System.out.printf("%s завершил работу.%n", Thread.currentThread().getName());
            });
            countryThreads.add(thread);
            thread.start();
        }

        try {
            for (Thread thread : countryThreads) {
                thread.join();
            }
            factoryThread.interrupt();

            int winner = getFastestCountry(productionTimes); // определяем индекс страны с минимальным временем выполнения производства
            System.out.printf("%s выиграл!%n", Thread.currentThread().getName());
            System.out.printf("Быстрейшая страна: %d. Время выполнения производства роботов: %d нс.%n", winner + 1, productionTimes[winner]);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int getFastestCountry(long[] productionTimes) {
        int fastestIndex = 0;
        long fastestTime = productionTimes[0];
        for (int i = 1; i < productionTimes.length; i++) {
            if (productionTimes[i] < fastestTime) {
                fastestTime = productionTimes[i];
                fastestIndex = i;
            }
        }
        return fastestIndex;
    }
}
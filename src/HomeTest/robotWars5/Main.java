package HomeTest.robotWars5;

import java.util.ArrayList;
import java.util.List;

import static HomeTest.robotWars5.ConstantRoboArmy.ARMY_SIZE;
import static HomeTest.robotWars5.ConstantRoboArmy.PRODUCTION_TIME;

public class Main {
    public static void main(String[] args) { // объявление метода main, который является входной точкой программы.

        Factory factory = new Factory(); // - создание объекта Factory, который будет производить части для роботов.
        Country[] countries = new Country[ARMY_SIZE]; //  - создание массива объектов Country, представляющих каждую из участвующих стран в игре.
        for (int i = 0; i < ARMY_SIZE; i++) {
            countries[i] = new Country(factory);
        } // - заполнение массива countries объектами Country, каждый из которых получает ссылку на объект factory.
        Thread factoryThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(PRODUCTION_TIME);
                } catch (InterruptedException e) {
                    break;
                }
            }// - создание отдельного потока factoryThread, который будет запускать производство частей для роботов.
        });
        factoryThread.setDaemon(true);
        factoryThread.start();

        List<Thread> countryThreads = new ArrayList<>(); //- создание списка потоков countryThreads, которые будут запускать производство роботов в каждой стране.
        long[] productionTimes = new long[ARMY_SIZE]; // массив для сохранения времени выполнения производства роботов в каждой стране
        for (int i = 0; i < countries.length; i++) {
            final int index = i;
            Thread thread = new Thread(() -> {
                countries[index].buildArmy();
                productionTimes[index] = factory.getProductionTime(); // сохраняем время выполнения производства роботов в текущей стране
                System.out.printf("%s завершил работу.%n", Thread.currentThread().getName());
            });
            //- установка флага daemon для потока factoryThread, чтобы поток завершался автоматически при завершении основного потока программы.
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
// определение максимально быстрой страны.
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
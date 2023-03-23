package HomeTest.robotWars;

import java.util.Random;

public class RobotWar5 {
    private static final int REQUIRED_ROBOTS = 20;
    private static final int MAX_TRIES = 100; // Исключаю вечный цикл.
    private static final int PRODUCTION_TIME = 5000; // 5 seconds
    private static final int BODY_PARTS = 6;
    private static final int ARMY_SIZE = 2;

    private static final String[] COUNTRIES = {"Country A", "Country B"};
    private static final String[] BODY_PART_NAMES = {"Left Arm", "Right Arm", "Left Leg", "Right Leg", "Body", "Head"};

    private static int[][][] armies = new int[ARMY_SIZE][BODY_PARTS][2];
    private static int[] partsOnFactory = new int[BODY_PARTS];
    private static Random rand = new Random();

    public static void main(String[] args) {
        // Запускаем производство деталей на заводе
        for (int i = 0; i < BODY_PARTS; i++) {
            partsOnFactory[i] = rand.nextInt(5) + 1; // Случайные числа от 1 до 5
        }

        // Начать войну
        int tries = 0;
        while (true) {
            // Проверяет, достигла ли какая-либо страна необходимого количества роботов
            for (int i = 0; i < ARMY_SIZE; i++) {
                if (getArmySize(i) >= REQUIRED_ROBOTS) {
                    System.out.println(COUNTRIES[i] + " выиграла войну!");
                    System.exit(0);
                }
            }

            // Проверьте, достигнуто ли максимальное количество попыток
            if (tries >= MAX_TRIES) {
                System.out.println("Война закончилась вничью.");
                System.exit(0);
            }

            // Создавать случайную часть тела каждые PRODUCTION_TIME milliseconds
            int producedPart = rand.nextInt(BODY_PARTS);
            partsOnFactory[producedPart]++;
            System.out.println("A " + BODY_PART_NAMES[producedPart] + " был произведен.");

            // Каждая страна пытается собрать необходимые детали для сборки робота.
            for (int i = 0; i < ARMY_SIZE; i++) {
                for (int j = 0; j < BODY_PARTS; j++) {
                    while (armies[i][j][0] + armies[i][j][1] < REQUIRED_ROBOTS) {
                        if (partsOnFactory[j] > 0) {
                            armies[i][j][0]++;
                            partsOnFactory[j]--;
                            System.out.println(COUNTRIES[i] + " собрал " + BODY_PART_NAMES[j] + ".");
                        } else {
                            break;
                        }
                    }
                }
            }

            tries++;

            try {
                Thread.sleep(PRODUCTION_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int getArmySize(int countryIndex) {
        int size = 0;
        for (int i = 0; i < BODY_PARTS; i++) {
            size += armies[countryIndex][i][0] + armies[countryIndex][i][1];
        }
        return size;
    }
}


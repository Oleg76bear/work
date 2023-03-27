package HomeTest.robotWars5;

public class Country {
    private final Factory factory;

    //
    private final Robot[] army = new Robot[ConstantRoboArmy.REQUIRED_ROBOTS];
    // объявляет массив army размера ConstantRoboArmy.REQUIRED_ROBOTS, который будет содержать собранных роботов.
    private long productionTime;

    public Country(Factory factory) { //- объявляет конструктор класса Country, который принимает на вход объект типа Factory и сохраняет его в переменной factory.
        this.factory = factory;
    }

    public Robot assembleRobot() { //- объявляет метод, который собирает робота, используя части, произведенные в factory.
        Robot robot = new Robot();
        while (!robot.isComplete()) {
            RobotPart part = factory.producePart(); //  создает новую часть робота с помощью метода producePart() из factory.
            robot.setPart(part);
            System.out.printf("%s добавил на склад %s%n", Thread.currentThread().getName(), part);
        }
        return robot; // - возвращает собранного робота.
    }

    public void buildArmy() { //  - объявляет метод, который собирает армию роботов.
        for (int i = 0; i < army.length; i++) {
            army[i] = assembleRobot(); // - создает нового робота и добавляет его в массив army.
            System.out.printf("%s собрал:  %d  роботов.%n", Thread.currentThread().getName(), i + 1);
            long time = factory.getProductionTime();
            if (time < productionTime || i == 0) {
                productionTime = time;
            }
        }
        System.out.printf("%s завершил работу за %d наносекунд.%n", Thread.currentThread().getName(), factory.getProductionTime());
    }
}

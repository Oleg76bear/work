package HomeTest.robotWars5;

public class Country {
    private final Factory factory;

    private final Robot[] army = new Robot[ConstantRoboArmy.REQUIRED_ROBOTS];
    private long productionTime;

    public Country(Factory factory) {
        this.factory = factory;
    }

    public Robot assembleRobot() {
        Robot robot = new Robot();
        while (!robot.isComplete()) {
            RobotPart part = factory.producePart();
            robot.setPart(part);
            System.out.printf("%s добавил на склад %s%n", Thread.currentThread().getName(), part);
        }
        return robot;
    }

    public void buildArmy() {
        for (int i = 0; i < army.length; i++) {
            army[i] = assembleRobot();
            System.out.printf("%s собрал:  %d  роботов.%n", Thread.currentThread().getName(), i + 1);
            long time = factory.getProductionTime();
            if (time < productionTime || i == 0) {
                productionTime = time;
            }
        }
        System.out.printf("%s завершил работу за %d наносекунд.%n", Thread.currentThread().getName(), factory.getProductionTime());
    }
}

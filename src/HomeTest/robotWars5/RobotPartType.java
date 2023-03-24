package HomeTest.robotWars5;

public enum RobotPartType {
    LEFT_ARM("Левую руку"),
    RIGHT_ARM("Правую руку"),
    LEFT_LEG("Левую ногу"),
    RIGHT_LEG("Правую ногу"),
    BODY("Тело"),
    HEAD("Голову");

    private String name;

    private RobotPartType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " (" + name().toLowerCase() + ")";
    }
}
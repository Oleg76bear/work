package HomeTest.robotWars5;

public class RobotPart {
    private final RobotPartType type;
    private final long creationTime;

    public RobotPart(RobotPartType type) {
        this.type = type;
        this.creationTime = System.nanoTime(); // устанавливаем текущее время при создании объекта
    }

    public RobotPartType getType() {
        return type;
    }

    public long getCreationTime() { // добавляем геттер для поля creationTime
        return creationTime;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}

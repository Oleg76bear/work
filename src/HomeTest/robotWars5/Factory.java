package HomeTest.robotWars5;

import java.util.Random;

public class Factory {
    private final Random random = new Random();

    private long productionTime = 0; // добавляем переменную для хранения времени выполнения

    public RobotPart producePart() {
        int index = random.nextInt(RobotPartType.values().length);
        RobotPart part = new RobotPart(RobotPartType.values()[index]);
        productionTime += System.nanoTime() - part.getCreationTime();
        return part;
    }

    public long getProductionTime() {
        return productionTime;
    }
}





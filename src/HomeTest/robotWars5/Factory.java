package HomeTest.robotWars5;

import java.util.Random;

// класс Factory отвечает за производство деталей робота и подсчет времени, затраченного на производство.
public class Factory {
    private final Random random = new Random();

    private long productionTime = 0; // добавляем переменную для хранения времени выполнения

    public RobotPart producePart() {
        int index = random.nextInt(RobotPartType.values().length); // создает случайную деталь робота, используя класс RobotPart,
        RobotPart part = new RobotPart(RobotPartType.values()[index]);
        productionTime += System.nanoTime() - part.getCreationTime(); // сохраняет время ее создания в переменную productionTime.
        return part;// Метод возвращает созданную деталь.
    }

    public long getProductionTime() { //  возвращает общее время производства всех деталей фабрикой.
        return productionTime;
    }
}





package HomeTest.robotWars5;

import java.util.Arrays;

import static HomeTest.robotWars5.ConstantRoboArmy.BODY_PARTS;

public class Robot {
    private final RobotPart[] parts = new RobotPart[BODY_PARTS];

    public void setPart(RobotPart part) {
        parts[part.getType().ordinal()] = part;
    }
//  - устанавливает значение элемента массива parts,
//  соответствующего типу добавляемой части робота, равным объекту RobotPart, переданному в качестве аргумента.
    public boolean isComplete() { // метод, который проверяет, содержит ли массив parts все части робота.
        for (RobotPart part : parts) {
            if (part == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(parts);
    }
}

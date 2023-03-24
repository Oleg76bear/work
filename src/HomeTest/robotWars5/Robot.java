package HomeTest.robotWars5;

import java.util.Arrays;

import static HomeTest.robotWars5.ConstantRoboArmy.BODY_PARTS;

public class Robot {
    private final RobotPart[] parts = new RobotPart[BODY_PARTS];

    public void setPart(RobotPart part) {
        parts[part.getType().ordinal()] = part;
    }

    public boolean isComplete() {
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

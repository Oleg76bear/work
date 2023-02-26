package shcool.car;


public enum WheelSize {
    SIZE_15(4),
    SIZE_16(4),
    SIZE_17(4),
    SIZE_18(4),
    SIZE_19(4),
    SIZE_20(4);

    private final int numberOfWheels;

    WheelSize(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Car.Wheel[] getWheels() {
        return new Car.Wheel[numberOfWheels];
    }
}
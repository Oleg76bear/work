package HomeTest.transport;

public enum WheelSize {
    ENUM_SIZE3("13 дюймов"),
    ENUM_SIZE14("14 дюймов"),
    ENUM_SIZE15("15 дюймов"),
    ENUM_SIZE16("16 дюймов"),
    ENUM_SIZE17("17 дюймов"),
    ENUM_SIZE18("18 дюймов"),
    ENUM_SIZE19("19 дюймов"),
    ENUM_SIZE20("20 дюймов"),
    ENUM_SIZE21("21 дюймов"),
    ENUM_SIZE22("22 дюймов");


    private final String wheelSizeCar;

    WheelSize(String wheelSizeCar) {
        this.wheelSizeCar = wheelSizeCar;
    }

    public String getWheelSizeCar() {
        return wheelSizeCar;
    }
}

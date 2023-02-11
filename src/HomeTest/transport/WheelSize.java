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

        System.out.println("Ваш автомобиль  с цветом " + this.wheelSizeCar + " правильно?");
    }

    public String getWheelSizeCar() {
        return wheelSizeCar;
    }
}


/*
    private static final List<String> SIZES;
    private final String size;

    static {
        SIZES = new ArrayList<>();
        for (WheelSize wheelSize : WheelSize.sizes()) {
            SIZES.add(wheelSize.size);
        }
    }

    private WheelSize(String size) {
        this.size = size;
    }

    public static List<String> getSizes() {
        return unmodifiableList(SIZES);
    }

    List<String> sizes = WheelSize.getSizes();
}

 */
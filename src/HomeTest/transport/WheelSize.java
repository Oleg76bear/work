package HomeTest.transport;

public enum WheelSize {
    ENUM_SIZE3("13 ������"),
    ENUM_SIZE14("14 ������"),
    ENUM_SIZE15("15 ������"),
    ENUM_SIZE16("16 ������"),
    ENUM_SIZE17("17 ������"),
    ENUM_SIZE18("18 ������"),
    ENUM_SIZE19("19 ������"),
    ENUM_SIZE20("20 ������"),
    ENUM_SIZE21("21 ������"),
    ENUM_SIZE22("22 ������");


   private final String wheelSizeCar;
    WheelSize(String wheelSizeCar) {
        this.wheelSizeCar = wheelSizeCar;

        System.out.println("��� ����������  � ������ " + this.wheelSizeCar + " ���������?");
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
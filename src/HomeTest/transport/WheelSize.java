package HomeTest.transport;

public enum WheelSize {
    ENUM_SIZE3("13 ה‏ילמג"),
    ENUM_SIZE14("14 ה‏ילמג"),
    ENUM_SIZE15("15 ה‏ילמג"),
    ENUM_SIZE16("16 ה‏ילמג"),
    ENUM_SIZE17("17 ה‏ילמג"),
    ENUM_SIZE18("18 ה‏ילמג"),
    ENUM_SIZE19("19 ה‏ילמג"),
    ENUM_SIZE20("20 ה‏ילמג"),
    ENUM_SIZE21("21 ה‏ילמג"),
    ENUM_SIZE22("22 ה‏ילמג");


   private final String wheelSizeCar;
    WheelSize(String wheelSizeCar) {
        this.wheelSizeCar = wheelSizeCar;

        System.out.println("Âאר אגעמלמבטכü  ס צגועמל " + this.wheelSizeCar + " ןנאגטכüםמ?");
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
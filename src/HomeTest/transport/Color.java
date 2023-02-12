package HomeTest.transport;

public enum Color {
    BLUE("Синий"),
    RED("Красный"),
    GREEN("Зеленый"),
    ORANGE("Оранжевый"),
    BLACK("Черный"),
    VIOLET("Фиолентовый"),
    YELLOW("Желтый"),
    WHITE("Белый"),
    GRAY("Серый");


    private final String colorCar;

    Color(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getColorCar() {
        return colorCar;
    }
}


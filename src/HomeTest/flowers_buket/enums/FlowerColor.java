package HomeTest.flowers_buket.enums;

public enum FlowerColor {
    WHITE("Белый"),
    BLACK("Черный"),
    RED("Красный"),
    YELLOW("Желтый");

    private String colorFlow;

    FlowerColor(String colorFlow) {
        this.colorFlow = colorFlow;
    }

    public String getColorFlow() {
        return colorFlow;
    }

}


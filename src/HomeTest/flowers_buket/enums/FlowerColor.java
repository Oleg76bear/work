package HomeTest.flowers_buket.enums;

public enum FlowerColor {
    WHITE("�����"),
    BLACK("������"),
    RED("�������"),
    YELLOW("������");

    private String colorFlow;

    FlowerColor(String colorFlow) {
        this.colorFlow = colorFlow;
    }

    public String getColorFlow() {
        return colorFlow;
    }

}


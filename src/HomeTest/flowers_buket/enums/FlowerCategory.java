package HomeTest.flowers_buket.enums;

public enum FlowerCategory {

    ROSE("����"),
    LILIA("�����"),
    FIALKA("������"),
    ASTRA("�����"),
    CARNATION("��������"),
    TULIP("�������");

    private String name;

    FlowerCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


package HomeTest.flowers_buket.enums;

public enum FlowerCategory {

    ROSE("Роза"),
    LILIA("Лилия"),
    FIALKA("Фиалка"),
    ASTRA("Астра"),
    CARNATION("Гвоздика"),
    TULIP("Тюльпан");

    private String name;

    FlowerCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


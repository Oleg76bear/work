package shcool.car;

public enum Model {
    AUDI(0),
    BMW(1),
    MERCEDES(2),
    TOYOTA(3),
    HONDA(4),
    ;

    private int index;

    Model(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
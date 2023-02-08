package by.itacademy.task;


public enum Day {
    Monday(1),
    Tusday(2),
    Wensdey(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sanday(7),;


    private int number;

    Day(int number) {
        this.number = number;

    }

    public static String getNameByNumber(int number) {

        for (Day day : Day.values()) {
            if (day.number == number) {
                return day.name();
            }
        }
        return null;


    }

    public int getNamber() {
        return number;
    }
}


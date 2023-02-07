// Çàäà÷à 1:
//Çàäà÷à ñ ìåñÿöàìè ãîäà.
//
//Íåîáõîäèìî ðåàëèçîâîòü êëàññ êîòîðûé èìååò äâà ìåòîäà:
//1) îïðåäåëèòü íîìåð ìåñÿöà ïî èìåíè.
//2) îïðåäåëèòü èìÿ ìåñÿöà ïî íîìåðó.
//Ðåêîìåííäîâàííî èñïîëüçîâàòü Enum.

 package HomeTest;

public class Work2_W1 {
    enum Month {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);
        private int number;

        Month(int i) {
            number = i;
        }

        public static String getNameByNumber(int number) {
            for (Month m : Month.values()) {
                if (m.number == number) {
                    return m.name();
                }
            }
            return null;
        }

        public static int getNumberByName(String name) {
            for (Month m : Month.values()) {
                if (m.name().equals(name)) {
                    return m.number;
                }
            }
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(Month.getNumberByName("NOVEMBER"));
        System.out.println(Month.getNameByNumber(12));
    }
}

/*
enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
  }
 public class Work2_W1 {
    public static void main(String[] args) {
        Month d = Month.DECEMBER;
        switch (d) {
            case JANUARY:
                System.out.println("1 Месяц календаря и 1 месяц зимы");
                break;
            case FEBRUARY:
                 System.out.println("2 Месяц календаря и 2 месяц зимы");
                break;
            case MARCH:
                System.out.println("3 Месяц календаря и 1 месяц весны");
                break;
            case APRIL:
                System.out.println("4 Месяц календаря и 2 месяц весны");
            case MAY:
                System.out.println("5 Месяц календаря и 3 месяц весны");
                break;
            case JUNE:
                System.out.println("6 Месяц календаря и 1 месяц лета");
                break;
            case JULY:
                System.out.println("7 Месяц календаря и 2 месяц лета");
                break;
            case AUGUST:
                System.out.println("8 Месяц календаря и 3 месяц лета");
            case SEPTEMBER:
                System.out.println("9 Месяц календаря и 1 месяц осени");
                break;
            case OCTOBER:
                System.out.println("10 Месяц календаря и 2 месяц осени");
                break;
            case NOVEMBER:
                System.out.println("11 Месяц календаря и 3 месяц осени");
            case DECEMBER:
                System.out.println("12 Месяц календаря и 1 месяц зимы");
                break;
            default:
                System.out.println("Вы неправильно записали месяц, попробуйте еще раз");
        }
    }
}

 */

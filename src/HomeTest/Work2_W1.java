// ������ 1:
//������ � �������� ����.
//
//���������� ����������� ����� ������� ����� ��� ������:
//1) ���������� ����� ������ �� �����.
//2) ���������� ��� ������ �� ������.
//��������������� ������������ Enum.

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
    }
}
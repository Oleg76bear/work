public class Task14 {
    public static void main(String[] args) {
        long oneNumber = 1;
        long work = 1;
           do {
            work *= oneNumber;
            oneNumber++;
        } while (oneNumber <= 25 && oneNumber > 0);
        System.out.println("������������ ����� �� 1 �� 25 ����� : " + work);
        }
    }

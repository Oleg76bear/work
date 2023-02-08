package HomeTest.ClassBook;

public class Task13 {
    public static void main(String[] args) {
        int factoril = 10;
        int i = 1;
        while (i < 10) {
            factoril *=i;
            i++;
        }
        System.out.println("Факториал: " + factoril);
    }
}

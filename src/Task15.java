public class Task15 {
    public static void main(String[] args) {
        long namber = 7893823445l;
        long sum = 0;
        do {
            sum = sum + namber % 10;
            namber = namber / 10;
        } while (namber > 0);
        System.out.println("Сумма равна : " + sum);
    }
}
// public static long sumDigits(long i) {
//    return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
//}
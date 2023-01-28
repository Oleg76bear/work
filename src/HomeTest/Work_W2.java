package HomeTest;
/*   Задание 2.
        Необходимо найти сумму всех четных чисел в последовательности Фибоначи, до
        определенного индекса "n".
 */

    public class Work_W2 {public static void main(String[] args) {

        long n1 = 1;
        long n2 = 2;
        long n = 40;       // Введите число.
        long x = 0;
        long sum = 2;

        while (x < n) {
            x = n1 + n2;
            n1 = n2;
            n2 = x;
            if (x % 2 == 0) {
                sum = sum + x;
            }
        }
        System.out.print(sum);
    }
}
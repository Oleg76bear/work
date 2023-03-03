// Необходимо реализовать программу, которая будет считывать
//числа (целые), введенные пользователем, пока пользователь
//не введет "stop" слово. После чего программа выведет среднее
//из всех введенных значений.

package HomeTest.testFives;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Введите число или \"stop\" для завершения: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введено некорректное значение!");
                }
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Нет введенных значений.");
        }
    }
}


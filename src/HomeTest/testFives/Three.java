// Необходимо реализовать программу, которая будет считывать
//числа, введенные пользователем, пока пользователь не введет
//"stop" слово. по команде "status" необходимо вывести введенные
//цифры в отсортированном виде (от меньшего к большему).

package HomeTest.testFives;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        boolean stopped = false;
        System.out.println("Введите \"status\" для вывода введенных чисел в порядке увеличения или введите \"stop\" для завершения.");
        System.out.println();
        while (!stopped) {
            System.out.print("Введите число или \"stop\" для завершения: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                stopped = true;
            } else if (input.equals("status")) {
                if (numbers.isEmpty()) {
                    System.out.println("Список чисел пуст.");
                } else {
                    Collections.sort(numbers);
                    System.out.println("Список чисел: " + numbers);
                }
            } else {
                try {
                    int num = Integer.parseInt(input);
                    numbers.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введено некорректное значение!");
                }
            }
        }
        if (!numbers.isEmpty()) {
            Collections.sort(numbers);
            System.out.println("Список чисел: " + numbers);
        }
    }
}

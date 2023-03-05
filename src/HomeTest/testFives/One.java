// Необходимо реализовать программу, которая будет бесконечно
//считывать строки введенные пользователем и выводить их в консоль.

package HomeTest.testFives;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Введите строку: ");
                String input = scanner.nextLine();

                // Проверка наличия цифр, символов или пробелов в строке
                //     if (input.matches("[^\\w\\s]*") || input.matches("[\\d\\s]*")) {
             //       throw new IllegalArgumentException("Введена некорректная строка!");
            //    }

                System.out.println("Вы ввели: " + input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}



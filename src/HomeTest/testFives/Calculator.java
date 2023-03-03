//Необходимо реализовать программу "калькулятор".
//Поддерживаемые операции +-/* выбор операции и ввод данных
//осуществляется пользователем с клавиатуры.

package HomeTest.testFives;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;
        boolean repeat = true;
        while (repeat) {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: деление на ноль!");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Ошибка: введен некорректный оператор!");
            }
            System.out.print("Хотите продолжить вычисления? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                repeat = false;
            }
        }
    }
}

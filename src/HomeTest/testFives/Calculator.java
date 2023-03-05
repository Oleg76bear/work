//Необходимо реализовать программу "калькулятор".
//Поддерживаемые операции +-/* выбор операции и ввод данных
//осуществляется пользователем с клавиатуры.

package HomeTest.testFives;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        boolean repeat = true;
        while (repeat) {
            System.out.println("Введите первое число:");
            double num1 = 0;
            try {
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка ввода! Введите число:");
                    scanner.next();
                }
                num1 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите число:");
                scanner.next();
                continue;
            }
            System.out.println("Введите второе число:");
            double num2 = 0;
            try {
                while (!scanner.hasNextDouble()) {
                    System.out.println("Ошибка ввода! Введите число:");
                    scanner.next();
                }
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Введите число:");
                scanner.next();
                continue;
            }
            double result = 0;
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
            repeat = scanner.next().equalsIgnoreCase("y");
        }
        scanner.close();
    }
} // TODO: 05.03.2023 Класс использует Метод Scanner.hasNextDouble() число типа double. Возвращает true.


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        char operator;
//        boolean repeat = true;
//        while (repeat) {
//            System.out.println("Введите первое число:");
//            double num1 = 0;
//            try {
//                num1 = Double.parseDouble(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода! Введите число.");
//                continue;
//            }
//            System.out.println("Введите второе число:");
//            double num2 = 0;
//            try {
//                num2 = Double.parseDouble(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода! Введите число.");
//                continue;
//            }
//            double result = 0;
//            System.out.print("Введите оператор (+, -, *, /): ");
//            operator = scanner.next().charAt(0);
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    System.out.println(num1 + " + " + num2 + " = " + result);
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    System.out.println(num1 + " - " + num2 + " = " + result);
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    System.out.println(num1 + " * " + num2 + " = " + result);
//                    break;
//                case '/':
//                    if (num2 == 0) {
//                        System.out.println("Ошибка: деление на ноль!");
//                    } else {
//                        result = num1 / num2;
//                        System.out.println(num1 + " / " + num2 + " = " + result);
//                    }
//                    break;
//                default:
//                    System.out.println("Ошибка: введен некорректный оператор!");
//            }
//            System.out.print("Хотите продолжить вычисления? (y/n): ");
//            String answer = scanner.next();
//            if (!answer.equalsIgnoreCase("y")) {
//                repeat = false;
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//    }
//} // TODO: 05.03.2023 Класс использует Метод Scanner.  Double.parseDouble() число типа double. Возвращает число типа double.
// TODO: 05.03.2023 Используется исключение для "y", если нет то программа вылетает.

//        Scanner scanner = new Scanner(System.in);
//        char operator;
//        boolean repeat = true;
//        do {
//            System.out.println("Введите первое число:");
//            double num1 = 0;
//            try {
//                num1 = Double.parseDouble(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода! Введите число.");
//                continue;
//            }
//            System.out.println("Введите второе число:");
//            double num2 = 0;
//            try {
//                num2 = Double.parseDouble(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка ввода! Введите число.");
//                continue;
//            }
//            double result = 0;
//            System.out.print("Введите оператор (+, -, *, /): ");
//            operator = scanner.next().charAt(0);
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    System.out.println(num1 + " + " + num2 + " = " + result);
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    System.out.println(num1 + " - " + num2 + " = " + result);
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    System.out.println(num1 + " * " + num2 + " = " + result);
//                    break;
//                case '/':
//                    if (num2 == 0) {
//                        System.out.println("Ошибка: деление на ноль!");
//                    } else {
//                        result = num1 / num2;
//                        System.out.println(num1 + " / " + num2 + " = " + result);
//                    }
//                    break;
//                default:
//                    System.out.println("Ошибка: введен некорректный оператор!");
//                    continue;
//            }
//            do {
//                System.out.print("Хотите продолжить вычисления? (y/n): ");
//                String answer = scanner.next();
//                if (answer.equalsIgnoreCase("y")) {
//                    repeat = true;
//                    break;
//                } else if (answer.equalsIgnoreCase("n")) {
//                    repeat = false;
//                    break;
//                } else {
//                    System.out.println("Ошибка: введен некорректный ответ! Введите 'y' или 'n'.");
//                }
//            } while (true);
//            scanner.nextLine();
//        } while (repeat);
//        scanner.close();
//    }
//}
// TODO: 05.03.2023 двойной  do do, в первом решаю задачу, а во втором проверяю букву 'y' или 'n'.

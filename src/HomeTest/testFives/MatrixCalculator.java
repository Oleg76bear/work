// Необходимо написать программу считающую сумму и разность двух
//квадратных матриц. Пользователь вводит матрицы с клавиатуры.

package HomeTest.testFives;
import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 0;
        int cols = 0;

        try {
            System.out.print("Введите количество строк: ");
            rows = Integer.parseInt(scanner.nextLine());

            System.out.print("Введите количество столбцов: ");
            cols = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода! Введите целое число.");
            return;
        }

        if (rows <= 0 || cols <= 0) {
            System.out.println("Ошибка: размер матрицы должен быть положительным числом.");
            return;
        }

         // Ввод первой матрицы
        int[][] matrix1 = new int[rows][cols];
        System.out.println("Введите первую матрицу, целые числа через пробел в сточку:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Ввод второй матрицы
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Введите вторую матрицу, целые числа через пробел в строчку:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Вычисление суммы матриц
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Вычисление разности матриц
        int[][] difference = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Вывод результатов
        System.out.println("Сумма матриц:");
        printMatrix(sum);
        System.out.println("Разность матриц:");
        printMatrix(difference);

        scanner.close();
    }

    // Метод для вывода матрицы в консоль
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

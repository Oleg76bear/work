// Необходимо написать программу считающую сумму и разность двух
//квадратных матриц. Матрицы необходимо считывать из файла (INPUT).
//Матрицы в фаиле хранятся в следующем виде:
//3 3
//1 2 3
//1 2 3
//1 2 3
//
//1 2 3
//1 2 3
//1 2 3
//Первая строка содержит размерность матриц.
//Далее идут сами матрицы разделенные пустой строкой.


package HomeTest.testFives;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MatrixCalculatorInput  {

    private static final String FILE_NAME = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\Matrix";

    public static void main(String[] args) throws IOException, ClassNotFoundException{
               try {

            // Открытие файла для чтения
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);

            // Считывание размерности первой матрицы
            int rows1 = scanner.nextInt();
            int cols1 = scanner.nextInt();
                   // Проверка возможности вычислений
                   if (rows1 != cols1 ) {
                       System.out.println("Ошибка: размерности матриц не совпадают");
                       return;
                   }
            // Считывание первой матрицы
            int[][] matrix1 = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Пропуск пустой строки
            scanner.nextLine();

            // Задаем размерности второй матрицы
            int rows2 = rows1;
            int cols2 = cols1;

            // Считывание второй матрицы
            int[][] matrix2 = new int[rows2][cols2];
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Закрытие файла
            scanner.close();


            // Вычисление суммы и разности матриц
            int[][] sum = new int[rows1][cols1];
            int[][] diff = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    diff[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            // Вывод результатов в консоль
            System.out.println("Сумма матриц:");
            printMatrix(sum);
            System.out.println("Разность матриц:");
            printMatrix(diff);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
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

package HomeTest.One;

public class Work_W4 {
    /* Задание 4
Дан некоторый двумерный массив "int[][] matrix". Нужно определить каких чисел
в нем больше, положительных или отрицательных.

 */
         public static void main(String[] args) {
            int[][] matrix = {
                    {-5, -2, -3, 7},
                    {1, -5, -2, 2},
                    {1, -2, 3, -4}
                     };
            // Сначала вычисляем сумму положительных чисел.
            int positiv = 0;
            int negativ = 0;
            for (int[] ints : matrix) {
                for (int anInt : ints)
                    if (anInt > 0) {
                        positiv = positiv + anInt;
                    }
            }
            // Далее  вычисляем сумму отрицательных чисел.

             for (int[] ints : matrix) {
                for (int anInt : ints)
                    if (anInt < 0) {
                        negativ = negativ + anInt;
                    }
            }
            if (Math.abs(positiv) > Math.abs(negativ)) {
                System.out.println("Положительных чилел больше, их сумма равна: " + positiv);
            } else {
                System.out.println("Отрицательных чилел больше, их сумма равна: " + negativ);
            }
      }
}

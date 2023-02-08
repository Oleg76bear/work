// Задача 3:
//Необходимо создать класс который имеет метод чтобы накапливать 5 последних переданных
//в него цифровых значений. Так же необходимо создать метод который выводит
//среднее из накопленных значений.

package HomeTest.Two;

import java.util.Arrays;

public class Work2_W3 {
    public static void main(String[] args) {
        int[] mas = {12, 1, 2, 2, 1, 4, 4, 5};
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length / 2; i++) {
            int temp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = temp;
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            int tempw = mas[i];
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            if (i > 4) {
                mas[i] = 0;
            }
        }
        double sum = 0;
        for (int x : mas) {
            sum += x;
        }
        System.out.println("среднее арифметическое чисел равно: " + sum / 5);
        System.out.println(Arrays.toString(mas));
    }
}



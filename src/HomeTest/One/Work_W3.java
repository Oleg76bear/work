package HomeTest.One;

import java.util.Arrays;
/* ������� 3
     ��� ��������� ������ "int[] array", ���������� ������������� ���.
 */
 public class Work_W3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 0, 5, 9, 3};
        System.out.println("������ �������� " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
                   int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("������ ��������������� " + Arrays.toString(arr));
    }
}


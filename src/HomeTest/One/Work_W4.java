package HomeTest.One;

public class Work_W4 {
    /* ������� 4
��� ��������� ��������� ������ "int[][] matrix". ����� ���������� ����� �����
� ��� ������, ������������� ��� �������������.

 */
         public static void main(String[] args) {
            int[][] matrix = {
                    {-5, -2, -3, 7},
                    {1, -5, -2, 2},
                    {1, -2, 3, -4}
                     };
            // ������� ��������� ����� ������������� �����.
            int positiv = 0;
            int negativ = 0;
            for (int[] ints : matrix) {
                for (int anInt : ints)
                    if (anInt > 0) {
                        positiv = positiv + anInt;
                    }
            }
            // �����  ��������� ����� ������������� �����.

             for (int[] ints : matrix) {
                for (int anInt : ints)
                    if (anInt < 0) {
                        negativ = negativ + anInt;
                    }
            }
            if (Math.abs(positiv) > Math.abs(negativ)) {
                System.out.println("������������� ����� ������, �� ����� �����: " + positiv);
            } else {
                System.out.println("������������� ����� ������, �� ����� �����: " + negativ);
            }
      }
}

package HomeTest.One;

public class Work_W1 {
    /*������� 1.
    ���� ��������� ������, ��������� �� ����� ����� "int[] array", ���� ���������
    ����� "n". ���������� ��������� ����� ���� ��������� �������, ������ ���� �
    ������� ����������� ����� "n" �� � ����� ��� �������� �� �����.
         */

    public static void main(String[] args) {
      int n = 9; // �������� ����� ������� �� ����� ����������� ��� ������������ �������
       int sum = 0;
        int[] arr = {1, 3, 5, 3, 8, 5, 9, 3};
        for (int j : arr) {
            if (j == n) {
                continue;
            }
            sum += j;
        }
            System.out.println("����� ����� ������� �� ����������� �����, n: " + sum);
    }
}



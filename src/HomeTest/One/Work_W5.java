package HomeTest.One;


import static HomeTest.One.Work_W5_1.isLowerTriangularMatrix;

public class Work_W5 {

        public static void main(String[] args) {

            int rows = 5, columns = 5;

                    int[][] Matrix = {
                    { 1, 0, 0, 0, 0},
                    { 0, 3, 0, 8, 0},
                    { 0, 0, 7, 0, 0},
                    { 0, 0, 0, 6, 0},
                    { 0, 0, 0, 0, 0}
            };
            // ������� �� ����� �������
            System.out.println("Matrix is : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }

            // �������� �������� �� ������� ����������������
            boolean result
                    = isLowerTriangularMatrix(Matrix);

            if (result) {
                System.out.println(
                        "���� true �� ������� ���������������� ��������");
            }
            else {
                System.out.println(
                        "���� false �� ������� ����������������  �� ��������");
            }
        }
    }


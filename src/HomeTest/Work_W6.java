package HomeTest;

/* ������� 6
  ���� ��� ���������� �������. ���������� �������� ��������� ������� ��������� ��
 ����� � ��������.
 */
   public class Work_W6 {
       public static void main (String[]args){
           int[][] matrix1 = {
                   {10, 5, 12},
                   {98, 5, 6},
                   {8, 4, 6},
                    };
           int[][] matrix2 = {
                   {8, 7, 5},
                   {19, 56, 4},
                   {8, 76, 90},
                     };
           // ������� ��������� �����
           int[][] matrixSum;
           matrixSum = new int[matrix1.length][matrix1[0].length];
           for (int y = 0; y < matrix1.length; y++) {
               for (int x = 0; x < matrix1[y].length; x++) {
                   int numMatrix1 = matrix1[y][x];
                   int numMatrix2 = matrix2[y][x];
                   int sum = numMatrix1 + numMatrix2;
                   int min = numMatrix1 - numMatrix2;
                   matrixSum[y][x] = sum;
                  }
                  }
           // ����� ��������� ��������
           int[][] matrixMin;
           matrixMin = new int[matrix1.length][matrix1[0].length];
           for (int y = 0; y < matrix1.length; y++) {
               for (int x = 0; x < matrix1[y].length; x++) {
                   int numMatrix1 = matrix1[y][x];
                   int numMatrix2 = matrix2[y][x];
                   int min = numMatrix1 - numMatrix2;
                   matrixMin[y][x] = min;
                 }
           }
               // ����� ������� ���������
               System.out.println("\t\t\t1\t\t\t\t\t2\t\t\t\t�����\t\t\t\t��������");
               for (int x = 0; x < 86; x++) {
                   System.out.print("_");
               }
               System.out.println();
               // �������, ������� ��������� � �������� � ����������
               for (int y = 0; y < matrix1.length; y++) {
                   System.out.print(" | ");
                   for (int x = 0; x < matrix1[y].length; x++) {
                   System.out.printf("%5d ", matrix1[y][x]);
                   }
                   System.out.print(" | ");
                   for (int x = 0; x < matrix2[y].length; x++) {
                       System.out.printf("%5d ", matrix2[y][x]);
                   }
                   System.out.print(" | ");
                   for (int x = 0; x < matrixSum[y].length; x++) {
                       System.out.printf("%5d ", matrixSum[y][x]);
                   }
                   System.out.print(" | ");
                   for (int x = 0; x < matrixSum[y].length; x++) {
                       System.out.printf("%5d ", matrixMin[y][x]);
                   }
                   System.out.print(" | ");
                   System.out.println();
               }
                   for (int x = 0; x < 86; x++) {
                       System.out.print("_");
                   }
       }
    }

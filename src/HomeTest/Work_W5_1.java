package HomeTest;



public class Work_W5_1 {
    public static boolean
    isLowerTriangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
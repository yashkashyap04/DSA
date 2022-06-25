package Striver.Arrays;

public class SetZeroes {

    public static void main(String[] args) {
        int array[][] = {{-4,-2,6,-7,0},{-8,6,-8,-6,0},{2,2,-9,-6,-10}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        System.out.println();

        SetZeroes object = new SetZeroes();
        object.setZeroes(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    private void setZeroes(int[][] matrix) {
        int col0 = 1;
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numRows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < numCols; j++)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; 
                    matrix[0][j] = 0;
                }
        }

        for (int i = numRows - 1; i >= 0; i--) {
            for (int j = numCols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}

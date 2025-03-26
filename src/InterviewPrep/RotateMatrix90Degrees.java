package InterviewPrep;

import java.util.Arrays;

public class RotateMatrix90Degrees {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    /*
    Question: You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise)
    */

    /*
    Solution: The matrix is rotated by first transposing it (swapping rows with columns) and
              then reversing each row
    */

    public static void rotate(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = row; column < matrix.length; column++) {
                swapForTranspose(matrix, row, column);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length / 2; column++) {
                swapForReverse(matrix, row, column, (matrix.length - 1 - column));
            }
        }
    }

    public static void swapForTranspose(int[][] matrix, int row, int column) {
        int temp = matrix[column][row];
        matrix[column][row] = matrix[row][column];
        matrix[row][column] = temp;
    }

    public static void swapForReverse(int[][] matrix, int row, int column, int newColumn){
        int temp = matrix[row][column];
        matrix[row][column] = matrix[row][newColumn];
        matrix[row][newColumn] = temp;
    }
}

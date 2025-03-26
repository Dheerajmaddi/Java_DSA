package Search;

import java.util.Arrays;

public class BinarySearch2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30 ,40 ,50},
                {11, 21, 35, 46, 52},
                {15, 24, 37, 48, 53},
                {16, 26, 38, 49, 59}
        };
        int[][] arr1 = {};

        int search = 59;
        System.out.println("Position: " + Arrays.toString(searchInMatrix(arr, search)));
    }
    // Given matrix should be sorted row and column wise
    static int[] searchInMatrix(int[][] matrix, int target){
        if(matrix.length == 0)
            return new int[]{-1, -1};
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                return new int[]{row, column};
            } else if(matrix[row][column] < target){
                row++;
            } else{
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}

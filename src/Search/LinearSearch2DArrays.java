package Search;

import java.util.Arrays;

public class LinearSearch2DArrays {
    public static void main(String[] args) {

        int[][] input2DArray = {
                {1,2,3,4,5},
                {6,9,10,12,67},
                {8,34,54,69},
                {100, 3, 96}
        };
        int[] result = linearSearchReturnIndexes(input2DArray, 100);
        System.out.println(Arrays.toString(result));

    }

    static int[] linearSearchReturnIndexes(int[][] twoDArray, int search){ // Output : {row, column}

        for (int row = 0; row < twoDArray.length; row++) {
            for (int column = 0; column < twoDArray[row].length; column++) {
                if(twoDArray[row][column] == search)
                    return new int[] {row, column};
            }
        }
        return new int[] {-1, -1};
    }
}

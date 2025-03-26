package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[][] twoDimensionalArray = new int[5][5];
        int[][] twoDimensionalArray = {
                {1000},
                {1,3,5,7,944,6,5},
                {4,5,8},
                {1,26,8,0,10},
                {13,43,6,8,9,8}
        };
//        for (int row = 0; row < twoDimensionalArray.length; row++) {
//            for (int column = 0; column < twoDimensionalArray[row].length; column++){
//                twoDimensionalArray[row][column] = input.nextInt();
//            }
//        }

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            System.out.print("[");
            for (int column = 0; column < twoDimensionalArray[row].length; column++){
                System.out.print(twoDimensionalArray[row][column]);
                if(column != twoDimensionalArray[row].length - 1)
                    System.out.print(", ");
            }
            System.out.print("]");
            System.out.println();
        }

        System.out.println("-----------------");

        for (int[] row: twoDimensionalArray){
            System.out.println(Arrays.toString(row));
        }

    }
}

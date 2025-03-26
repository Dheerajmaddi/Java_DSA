package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] firstArray = new int[5];

        for (int index = 0; index < firstArray.length; index++) {
            firstArray[index] = input.nextInt();
        }
        System.out.println(Arrays.toString(firstArray));
    }
}

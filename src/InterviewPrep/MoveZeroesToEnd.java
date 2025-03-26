package InterviewPrep;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 0, 0, 0, 6, 1, 2, 7};
        moveZeroes(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /*
    Question: Given an array nums, write a function to move all 0's to the end of it
              while maintaining the relative order of the non-zero elements.
    */

    /*
    * First iterate through array and shift non-zero elements to the left in the same order using a starting index
    * Later fill zeroes in the remaining indices
    */

    public static void moveZeroes(int[] nums){
        int insertIndex = 0;

        for (int num : nums) {
            if(num != 0) nums[insertIndex++] = num;
        }

        while(insertIndex < nums.length){
            nums[insertIndex++] = 0;
        }
    }
}

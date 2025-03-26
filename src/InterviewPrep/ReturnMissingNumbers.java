package InterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class ReturnMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 7, 9, 9, 3};

        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }

    /*
    Question: Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.
    */

    /*
    * You are given an array nums of size n.
    * Each element in the array nums is an integer in the range [1, n]. This means the possible numbers in the array are from 1 to n, inclusive.
    * Some numbers in the range [1, n] may not appear in the array.
    */

    /*
    * This solution marks each number that appears in the array by negating the
      value, at its corresponding index (considering 1-based indexing).
    * In the second pass, it identifies the indices that contain positive numbers,
      indicating the numbers that didn't appear in the original array
   */
    
    public static List<Integer> findDisappearedNumbers(int[] numbers){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int index = Math.abs(numbers[i]) - 1;
            if(numbers[index] > 0){
                numbers[index] = -numbers[index];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                result.add(i + 1);
            }
        }
        return result;
    }
}

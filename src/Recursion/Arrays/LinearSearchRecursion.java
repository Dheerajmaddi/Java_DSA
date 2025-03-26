package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 34, 56, 100, 78, 98, 100, 100};
        int target = 100;
//        System.out.println(linearSearch(nums, target, 0));
//        System.out.println(linearSearchIndexFromStart(nums, target, 0));
//
//        System.out.println(linearSearchIndexFromLast(nums, target, nums.length - 1));
//        returnMultipleOccurrences(nums, target, 0);
//        System.out.println(lst);
//        ArrayList<Integer> indices = new ArrayList<>();
//        System.out.println(returnMultipleOccurrencesBest(nums, target, 0, indices));
        System.out.println(returnMultipleOccurrences2(nums, target, 0));
    }

    static boolean linearSearch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, ++index);
    }

    static int linearSearchIndexFromStart(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
           return linearSearchIndexFromStart(arr, target, ++index);
        }
    }

    static int linearSearchIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return linearSearchIndexFromLast(arr, target, --index);
        }
    }

    // Not Preferable method
    static ArrayList<Integer> lst = new ArrayList<>();
    static void returnMultipleOccurrences(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if (arr[index] == target){
            lst.add(index);
        }
        returnMultipleOccurrences(arr, target, ++index);
    }

    static ArrayList<Integer> returnMultipleOccurrencesBest(
            int[] arr, int target, int index, ArrayList<Integer> occurrences){

        if(index == arr.length){
            return occurrences;
        }
        if (arr[index] == target){
            occurrences.add(index);
        }
       return returnMultipleOccurrencesBest(arr, target, ++index, occurrences);
    }

    static ArrayList<Integer> returnMultipleOccurrences2(int[] arr, int target, int index){
        ArrayList<Integer> occurrences = new ArrayList<>();

        if(index == arr.length){
            return occurrences;
        }
        if (arr[index] == target){
            occurrences.add(index);
        }
        ArrayList<Integer> belowOccurrences = returnMultipleOccurrences2(arr, target, ++index);

        occurrences.addAll(belowOccurrences);
        return occurrences;
    }
}

package Recursion.Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(numArray, 0));
    }

    static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        // checks if next element in array is less than or equal
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }
}

package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 2, 3, 4, 5, 0, -4, -3, -6, 180, -10};
        performBubbleSort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }
    static void performBubbleSort(int[] arr){
        int arraySize = arr.length;
        boolean isSwapped;
        for (int i = 0; i < arraySize - 1; i++) {
            isSwapped = false;
            for (int j = 1; j < (arraySize - i); j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
    static void swap(int[] arr, int index, int previousIndex){
        int temp = arr[index];
        arr[index] = arr[previousIndex];
        arr[previousIndex] = temp;
    }
}

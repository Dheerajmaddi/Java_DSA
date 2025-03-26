package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 3, 4, 1, 2, -1, -2, -3, -70, 100, 10101, -2};
        int[] sortedArray = {6,2,6,5,1,2};
        performInsertionSort(sortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    static void performInsertionSort(int[] arr){
        int lastIndex = arr.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = {10, -1, 0, 100, 200 ,350, -33, 3, 6, 9};
        performSelectionSort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }

    static void performSelectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int lastIndex = arr.length - i - 1;
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int currentIndex, int preferredIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[preferredIndex];
        arr[preferredIndex] = temp;
    }

}

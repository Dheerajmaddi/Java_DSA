package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] unsortedArray = {4, 3, 2, 7, 8, 2, 3, 1};
        performCyclicSort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }

    static void performCyclicSort(int[] arr){
        if(arr.length == 1)
            return;
        int i = 0;
        while (i < arr.length){
            int number = arr[i];
            int expectedNumberIndex = number - 1;
            if(arr[i] == arr[expectedNumberIndex]){
                i++;
            } else {
                swap(arr, i, expectedNumberIndex);
            }
        }
    }

    static void swap(int[] arr, int currentIndex, int newIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[newIndex];
        arr[newIndex] = temp;
    }
}

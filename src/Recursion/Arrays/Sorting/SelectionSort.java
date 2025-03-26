package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numsArray = {4, 3, 2, 8, 1};
        selectionSort(numsArray, 0, numsArray.length - 1, 0);
        System.out.println(Arrays.toString(numsArray));
    }

    static void selectionSort(int[] arr, int start, int last, int max){
        if(last == 0)
            return;

        if(start <= last){
            if(arr[start] > arr[max]){
                max = start;
            }
            selectionSort(arr, ++start, last, max);
        } else {
            swap(arr, max, last);
            selectionSort(arr, 0, --last, 0);
        }
    }

    private static void swap(int[] arr, int currentIndex, int newIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[newIndex];
        arr[newIndex] = temp;
    }
}

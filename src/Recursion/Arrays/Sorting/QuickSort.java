package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numsArray = {5, 4, 3 ,2 ,1};
        sort(numsArray, 0, numsArray.length - 1);
        System.out.println(Arrays.toString(numsArray));

    }

    static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(start <= end){
            // also a reason why if its already sorted, it will not swap
            while(arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        // Now the pivot is at correct index, please sort two halves
        sort(arr, low, end);
        sort(arr, start, high);
    }

    static void swap(int[] arr, int currentIndex, int newIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[newIndex];
        arr[newIndex] = temp;
    }
}

package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numsArray = {5 ,4, 3, 2, 1};
        sort1(numsArray, 0, numsArray.length - 1);
        System.out.println(Arrays.toString(numsArray));


        int[] numsArray1 = {4, 3, 2, 1};
        sort(numsArray1, 0, numsArray1.length - 2);
        System.out.println(Arrays.toString(numsArray1));
    }

    static void sort(int[] arr, int start, int last){
        if(last < 0){
            return;
        }

        if(start <= last){
            if(arr[start] > arr[start + 1]){
                swap(arr, start, start + 1);
            }
            sort(arr, ++start, last);
        } else {
            sort(arr, 0, --last);
        }

    }

    static void swap(int[] arr, int currentIndex, int newIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[newIndex];
        arr[newIndex] = temp;
    }

    static void sort1(int[] arr, int start, int last){
        if(last == 0){
            return;
        }

        if(start < last){
            if(arr[start] > arr[start + 1]){
                swap(arr, start, start + 1);
            }
            sort1(arr, ++start, last);
        } else {
            sort1(arr, 0, --last);
        }
    }
}

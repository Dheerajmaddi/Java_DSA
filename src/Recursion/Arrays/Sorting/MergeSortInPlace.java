package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] numsArray = {5, 4, 3, 2, 1};

        divideInPlace(numsArray, 0, numsArray.length);
        System.out.println(Arrays.toString(numsArray));
    }

    static void divideInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        divideInPlace(arr, start, mid);
        divideInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] mergedArray = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
            } else {
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mergedArray[k] = arr[i];
            k++;
            i++;
        }

        while (j < end){
            mergedArray[k] = arr[j];
            k++;
            j++;
        }

        // System.arraycopy(mergedArray, 0, arr, start + 0, mergedArray.length);
        for (int l = 0; l < mergedArray.length; l++) {
            arr[start + l] = mergedArray[l];
        }
    }
}

package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class MergeSortInPlaceMyApproach {
    public static void main(String[] args) {
        int[] numsArray = {5, 2, 1};

        divideInPlaceMyApproach(numsArray, 0, numsArray.length - 1);
        System.out.println(Arrays.toString(numsArray));
    }

    static void divideInPlaceMyApproach(int[] arr, int start, int end){
        if(end - start == 0){
            return;
        }

        int mid = start + (end - start) / 2;

        divideInPlaceMyApproach(arr, start, mid);
        divideInPlaceMyApproach(arr, mid + 1, end);

        mergeInPlaceMyApproach(arr, start, mid, end);
    }

    private static void mergeInPlaceMyApproach(int[] arr, int start, int mid, int end) {
        int[] mergedArray = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                mergedArray[k] = arr[i];
                i++;
            } else {
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            mergedArray[k] = arr[i];
            k++;
            i++;
        }

        while (j <= end){
            mergedArray[k] = arr[j];
            k++;
            j++;
        }

         System.arraycopy(mergedArray, 0, arr, start + 0, mergedArray.length);
        for (int l = 0; l < mergedArray.length; l++) {
            arr[start + l] = mergedArray[l];
        }
    }
}

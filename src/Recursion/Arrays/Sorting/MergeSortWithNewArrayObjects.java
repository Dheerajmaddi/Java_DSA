package Recursion.Arrays.Sorting;

import java.util.Arrays;

public class MergeSortWithNewArrayObjects {
    public static void main(String[] args) {
        int[] numsArray = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(divide(numsArray)));
    }

    static int[] divide(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = divide(Arrays.copyOfRange(arr, 0, mid));
        int[] right = divide(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mergedArray[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length){
            mergedArray[k] = second[j];
            k++;
            j++;
        }

        return mergedArray;
    }
}

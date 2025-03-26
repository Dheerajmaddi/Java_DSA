package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayBasicOperations {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8};
        System.out.println(Arrays.toString(arr));
//        swap(arr, 2, 5);
//
//        System.out.println(Arrays.toString(arr));


        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        reverseArrayInRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] inputArray,int index1, int index2){
        if(index2 < index1 || index2 > inputArray.length - 1)
            return;

        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }

    static void reverseArray(int[] inputArray){
        int start = 0;
        int end = inputArray.length - 1;
        while(start < end){
            swap(inputArray, start, end);
            start++;
            end--;
        }
    }

    static void reverseArrayInRange(int[] inputArray, int start, int end){
        if(end >= inputArray.length - 1)
            return;
        if(inputArray.length == 0)
            return;

        while(start < end){
            swap(inputArray, start, end);
            start++;
            end--;
        }
    }
}

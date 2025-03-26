package Recursion;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arrayToSearch = {1, 2, 4, 7, 11, 19, 100, 103};
        int numberToSearch = 103;
        int searchResult = binarySearchRecursion(
                arrayToSearch, numberToSearch, 0, arrayToSearch.length - 1);
        System.out.println("Returned index: " + searchResult);
    }

    static int binarySearchRecursion(int[] inputArray, int searchNumber, int start, int end){
        if( start > end)
            return -1;

        int midIndex = start + (end - start) / 2;

        if(inputArray[midIndex] == searchNumber)
            return midIndex;

        if(inputArray[midIndex] < searchNumber)
            return binarySearchRecursion(inputArray, searchNumber, midIndex + 1, end);

        return binarySearchRecursion(inputArray, searchNumber, start, midIndex - 1);
    }
}

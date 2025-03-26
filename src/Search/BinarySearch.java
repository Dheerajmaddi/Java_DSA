package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int search = 5;
        int result = ascendingBinarySearch(arr, search);
        System.out.println("Ascending Result: " + result);


        int[] arr1 = {90, 80, 70, 60, 54, 34, 23, 11, 9};
        int search1 = 23;
        int result1 = descendingBinarySearch(arr1, search1);
        System.out.println("Descending Result: " + result1);

        int[] arr2 = {3, 3, 3, 3, 3, 3};
        int search2 = 3;
        int result2 = orderAgnosticBinarySearch(arr2, search2);
        System.out.println("Order Agnostic Result: " + result2);
    }

    static int ascendingBinarySearch(int[] inputArray, int elementToSearch){
        int start = 0;
        int end = inputArray.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(inputArray[mid] < elementToSearch){
                start = mid + 1;
            } else if(inputArray[mid] > elementToSearch){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    static int descendingBinarySearch(int[] inputArray, int elementToSearch){
        int start = 0;
        int end = inputArray.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(inputArray[mid] < elementToSearch){
                end = mid - 1;
            } else if(inputArray[mid] > elementToSearch){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


    static int orderAgnosticBinarySearch(int[] inputArray, int elementToSearch){
        int start = 0;
        int end = inputArray.length - 1;
        
        boolean isAsc = false;
        
        if(inputArray[start] <  inputArray[end])
            isAsc = true;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(isAsc){
                if(inputArray[mid] < elementToSearch){
                    start = mid + 1;
                } else if(inputArray[mid] > elementToSearch){
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if(inputArray[mid] < elementToSearch){
                    end = mid - 1;
                } else if(inputArray[mid] > elementToSearch){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}

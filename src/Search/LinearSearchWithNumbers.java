package Search;

public class LinearSearchWithNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int elementToSearch = 5;
        int index = linearSearch(arr, elementToSearch);
        System.out.println("Return Index: " + index);


        System.out.println("Return Boolean: " + linearSearchReturnBoolean(arr, 8));

        System.out.println("Return Number: " + linearSearchReturnElement(arr, 9));

        System.out.println("Return Index In Range: " + linearSearchInRange(arr, 2, 1, 4));
    }
    static int linearSearch(int[] inputArray, int search){
        if(inputArray.length == 0)
            return -1;
        for(int index = 0; index < inputArray.length; index++){
            if(inputArray[index] == search)
                return index;
        }
        return -1;
    }


    static boolean linearSearchReturnBoolean(int[] inputArray, int search){
        if(inputArray.length == 0)
            return false;
        for(int index = 0; index < inputArray.length; index++){
            if(inputArray[index] == search)
                return true;
        }
        return false;
    }

    static int linearSearchReturnElement(int[] inputArray, int search){
        if(inputArray.length == 0)
            return -1;
        for(int number: inputArray){
            if(number == search)
                return number;
        }
        return -1;
    }

    static int linearSearchInRange(int[] inputArray, int search, int start, int end){
        if(inputArray.length == 0 || start > end )
            return -1;
        for(int index = start; index <= end; index++){
            if(inputArray[index] == search)
                return index;
        }
        return -1;
    }


}

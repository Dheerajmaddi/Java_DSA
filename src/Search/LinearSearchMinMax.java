package Search;

public class LinearSearchMinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Minimum: " + minimum(arr));
        System.out.println("Maximum: " + maximum(arr));
    }

    static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

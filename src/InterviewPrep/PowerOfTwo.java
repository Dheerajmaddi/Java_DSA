package InterviewPrep;

public class PowerOfTwo {
    public static void main(String[] args) {
        int numberToCheck = 32;
        System.out.println(isPowerOfTwo(numberToCheck));
    }

    /*
    Question: Given an integer, write a function to determine if it is a power of two.
    */

    /*
    Trick: A number n is a power of two if it has exactly one bit set to 1 in its binary representation.
     Using the expression n & (n - 1), we can zero out the lowest set bit;
     if the result is 0, then n was a power of two.*/

    public static boolean isPowerOfTwo(int number){
        return number > 0 && (number & (number - 1)) == 0;
    }
}

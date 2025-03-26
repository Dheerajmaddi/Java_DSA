package InterviewPrep;

public class AddAllDigits {
    public static void main(String[] args) {
        int num = 58219;
        System.out.println(addDigits(num));
        System.out.println(addDigitsEfficient(num));
    }

    /*
    Question: Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
    */

    /*
    This solution repeatedly extracts and sums the digits of num until num becomes
    a single-digit number
    */
    // Time Complexity: O(log n)
    // Space Complexity : O(1)
    public static int addDigits(int number){
        while(number >= 10){
            int sum = 0;
            while(number > 0){
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }

        return number;
    }

    /*
    * This is an efficient way to find the digital root of the number
    * The digital root can be calculated using: result = 1 + (num − 1) % 9
    * This formula works because of properties of numbers in modular arithmetic.
    */
    // Time Complexity: O(1) (constant time due to direct computation).
    // Space Complexity : O(1)
    public static int addDigitsEfficient(int number){
        return 1 + (number - 1) % 9;
    }
}

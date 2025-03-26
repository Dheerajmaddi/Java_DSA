package Recursion.BasicQuestions;

public class ReverseDigitsOfNumber {
    static int sum = 0;
    // This approach is using a variable outside the function, not preferable
    static void rev1(int number){
        if(number == 0)
            return;
        int last = number % 10;
        sum = sum * 10 + last;
        rev1(number / 10);
    }

    // This function uses a helper function and is a good practice
    static int rev2(int number){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(number)) + 1;
        return helper(number, digits);
    }

    private static int helper(int number, int digits) {
        if(number % 10 == number){
            return number;
        }
        int lastDigit = number % 10;
        return lastDigit * (int)(Math.pow(10, digits - 1)) + helper(number/10, digits-1);
    }

    static boolean isPalindrome(int number){
        return number == rev2(number);
    }

    static boolean isPalindromeConvertToString(int number){
        if(number % 10 == number)
            return true;

        StringBuilder numberInString = new StringBuilder();
        numberInString.append(number);
        int start = 0;
        int end = numberInString.length() - 1;
        while(start <= end){
            if(numberInString.charAt(start) == numberInString.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
//        rev1(1342);
//        System.out.println(sum);
//        System.out.println(rev2(12));
//        System.out.println(isPalindrome(123321));
        System.out.println(isPalindromeConvertToString(123321));
    }
}

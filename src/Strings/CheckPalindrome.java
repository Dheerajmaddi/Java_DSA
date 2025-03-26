package Strings;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "a";
        System.out.printf("Is Palindrome? %s%n", isPalindrome(s));
        System.out.printf("Reverse Technique: %s%n", reversePalindrome("abcedcba"));
    }

    static boolean isPalindrome(String inputString){
        if(inputString.isEmpty())
            return false;
        if(inputString.length() == 1)
            return true;

        int start = 0;
        int end = inputString.length() - 1;
        int mid = start + (end - start) / 2;
        boolean result = false;

        while(start <= mid){
            if (inputString.charAt(start) == inputString.charAt(end)){
               result = true;
               start++;
               end--;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    static boolean reversePalindrome(String str){
        StringBuilder builder = new StringBuilder(str);

        String reverseString = builder.reverse().toString();

        return str.equals(reverseString);
    }
}

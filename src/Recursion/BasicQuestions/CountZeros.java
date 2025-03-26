package Recursion.BasicQuestions;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(200404011));
    }

    static int count(int number){
        return helper(number, 0);
    }

    private static int helper(int number, int count) {
        if(number == 0)
            return count;

        int lastDigit = number % 10;

        if(lastDigit == 0){
            return helper(number/10, ++count);
        }
        return helper(number/10, count);
    }
}

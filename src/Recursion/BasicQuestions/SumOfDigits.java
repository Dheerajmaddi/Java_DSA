package Recursion.BasicQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(55555));
        System.out.println(1 % 10);
    }

    static int addDigits(int number){
        if(number == 0)
            return 0;
        return addDigits(number/10) + (number % 10);
    }
}

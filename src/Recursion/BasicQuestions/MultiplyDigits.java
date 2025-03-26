package Recursion.BasicQuestions;

public class MultiplyDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(550));
    }

    static int productOfDigits(int number){
        if(number % 10 == number){
            return number;
        }
        return productOfDigits(number / 10) * (number % 10);
    }
}

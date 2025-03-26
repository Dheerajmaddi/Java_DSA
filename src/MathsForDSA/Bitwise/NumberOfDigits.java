package MathsForDSA.Bitwise;

public class NumberOfDigits {
    public static void main(String[] args) {
        int number = 10;
        int base = 2;

        int digits = (int) (Math.log(number) / Math.log(base)) + 1;

//        int digits = 0;
//        while (number > 0) {
//            number = number / base;
//            digits++;
//        }

        System.out.println(digits);
    }
}

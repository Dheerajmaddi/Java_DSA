package MathsForDSA.Bitwise;


public class OddEven {
    public static void main(String[] args) {
        int number = 88;
        System.out.println(isEven(number));
        System.out.println(isOdd(number));
//        System.out.println(7 ^ 7);

    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}

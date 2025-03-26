package MathsForDSA.Bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        int number = 20;
        int digits = setBits(number);
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(-3));
//        System.out.println(digits);
    }

    private static int setBits(int number) {
        int count = 0;
        while(number > 0){
            count++;
            // method 1
//            number -= number & -number;

            // method 2
             number = number & (number - 1);


        }

        return count;
    }
}

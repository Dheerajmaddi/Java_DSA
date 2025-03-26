package MathsForDSA.Bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 8;
        int result = (number & (number - 1));
        boolean answer = result == 0;
        System.out.println(result);
        System.out.println(answer);
    }
}

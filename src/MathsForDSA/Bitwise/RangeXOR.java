package MathsForDSA.Bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int answer = xor(b) ^ xor(a - 1);
        System.out.println(answer);

        // Only for check, gives Time Limit Exceeded for large numbers
        int result = 0;
        for (int i = a; i <= b; i++) {
            result ^= i;
        }
        System.out.println(result);
    }

    private static int xor(int number) {
        if(number % 4 == 0){
            return 0;
        }

        if(number % 4 == 1){
            return 1;
        }
        if(number % 4 == 2){
            return number + 1;
        }

        return 0;
    }

}

package MathsForDSA.Numbers;

public class CheckPrime {
    public static void main(String[] args) {
        int number  = 36;

        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        if(number <= 1)
            return false;
        // Instead of Square root, also can use square of i
        // i.e., i * i <= number (while)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

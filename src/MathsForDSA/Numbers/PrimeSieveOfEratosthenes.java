package MathsForDSA.Numbers;

import java.util.Arrays;

public class PrimeSieveOfEratosthenes {
    public static void main(String[] args) {
        int number  = 40;
        // after calculation, in primes, false are considered prime
        boolean[] primes = new boolean[number + 1];
        isPrimeSieve(number, primes);
        System.out.println();
        System.out.println(Arrays.toString(primes));
    }
    // Time Complexity: O(n * log(log n))
    static void isPrimeSieve(int n, boolean[] primes){
        for (int i = 2; i * i <= n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <= n ; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}

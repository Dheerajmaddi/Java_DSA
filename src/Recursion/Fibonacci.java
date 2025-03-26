package Recursion;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci using Golden Ratio: " + fibonacciGoldenRatio(50));
//        System.out.println("Fibonacci: " + fibonacci(8));

    }

    // Linear Recurrence Relation very bad approach
    // (same recursive functions are executed multiple times)
    static int fibonacci(int number) {
        if(number == 1)
            return 1;
        else if(number == 0)
            return 0;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    static int fibonacciGoldenRatio(int number){
    // F6 = (1.6180346 - (1-1.618034)6)/√5 ≈ 8

        double sqrtOf5 = Math.sqrt(5);
        double phi = (1 + sqrtOf5) / 2;
        double negativePhi = (1 - sqrtOf5) / 2;

        // Apply Binet's Formula
        double fib = (Math.pow(phi, number) - Math.pow(negativePhi, number)) / sqrtOf5;

        return (int) Math.round(fib);
    }
}

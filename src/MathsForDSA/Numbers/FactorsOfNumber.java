package MathsForDSA.Numbers;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int number = 20;
        basicFactors(number);
        System.out.println();
        enhancedFactors1(number);
        System.out.println();
        enhancedFactors2(number);

    }
    // time complexity is O(N) and space complexity is O(1)
    static void basicFactors(int number){
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // time complexity is O(sqrt(N)) and space complexity is O(1)
    static void enhancedFactors1(int number){
        for (int i = 1; i * i <= number; i++) {
            if(number % i == 0){
                if(number/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + number/i + " ");
                }
            }
        }
    }
    // time complexity is O(sqrt(N)) and space complexity is O(sqrt(N))
    static void enhancedFactors2(int number){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            if(number % i == 0){
                System.out.print(i + " ");
                if(number/i != i){
                    divisors.add(number / i);
                }
            }
        }

        for (int i = divisors.size() - 1; i >= 0 ; i--) {
            System.out.print(divisors.get(i) + " ");
        }
    }

}

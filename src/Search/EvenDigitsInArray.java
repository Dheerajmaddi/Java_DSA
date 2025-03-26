package Search;

public class EvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 333, 345, 563, 7777, 8, 245, 111, 1111, 44, 0};

        int result = countEvenDigitNumbers(arr);
        System.out.println("Even Digits Number Count: " + result);

    }

    static int countEvenDigitNumbers(int[] inputArray){
        int numbersCount = 0;
        for (int element: inputArray) {
//            int digitCount = getDigits(element);
            int digitCount = getDigitsOptimized(element);
            System.out.println(digitCount);

            if(isEven(digitCount)){
                numbersCount++;
            }
        }
        return numbersCount;
    }

    static int getDigits(int number){
        if(number == 0)
            return 1;

        int digitsCountInNumber = 0;
        while (number > 0){
            digitsCountInNumber++;
            number /= 10;
        }
        return digitsCountInNumber;
    }

    static boolean isEven(int digits){
        return digits % 2 == 0;
    }

    static int getDigitsOptimized(int number){
        if(number < 0)
            number *= -1;
        if(number == 0)
            return 1;

        return (int) (Math.log10(number)+1);
    }
}

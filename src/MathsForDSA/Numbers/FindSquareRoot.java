package MathsForDSA.Numbers;

public class FindSquareRoot {
    public static void main(String[] args) {
        int number = 40;
        int precision = 3;
        System.out.println(getSquareRoot(number, precision));
        System.out.printf("%.3f",getSquareRoot(number, precision));
    }

    static double getSquareRoot(int number, int precision){
        double root = 0.0;
        int start = 0;
        int end = number;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(mid * mid == number){
                return mid;
            }
            if(mid * mid > number){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while(root * root <= number){
                root += increment;
            }

            root -= increment;
            increment /= 10;
        }

        return root;
    }
}

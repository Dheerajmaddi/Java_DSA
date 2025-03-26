package MathsForDSA.Numbers;

public class SquareRootNewtonRaphson {
    public static void main(String[] args) {
        int number = 36;
        System.out.println(squareRoot(number));
    }

    static double squareRoot(double number){
        double x = number;
        double root;

        while(true){
            root = 0.5 * (x + (number / x));
            // here 0.5 is error rate, reduce it to get more accurate results
            // But might take more iterations
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}

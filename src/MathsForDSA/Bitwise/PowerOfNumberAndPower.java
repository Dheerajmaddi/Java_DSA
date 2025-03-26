package MathsForDSA.Bitwise;

public class PowerOfNumberAndPower {
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        int answer = 1;

        while(power > 0){
            if((power & 1) == 1){
                answer *= number;
            }
            power = power >> 1;
            number *= number;
        }

        System.out.println(answer);


    }
}

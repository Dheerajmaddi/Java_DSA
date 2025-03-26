package MathsForDSA.Bitwise;

public class FindMagicNumber {
    public static void main(String[] args) {
        int givenNthNumber = 9;
        int answer = 0;
        int base = 5;

        while(givenNthNumber > 0){
            int last = givenNthNumber & 1;
            givenNthNumber = givenNthNumber >> 1;

            answer += last * base;
            base *= 5;
        }

        System.out.println(answer);
    }
}

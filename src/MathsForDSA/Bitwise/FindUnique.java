package MathsForDSA.Bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] numArray = {5, 3, 2, 2, 3, 5, 4};
        System.out.println(getUniqueValue(numArray));
//        System.out.println(0 ^ 4);
    }

    private static int getUniqueValue(int[] numArray) {
        int unique = 0;
        for (int number: numArray){
            unique ^= number;
        }
        return unique;
    }

}

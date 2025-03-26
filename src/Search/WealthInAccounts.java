package Search;

import java.util.Arrays;

public class WealthInAccounts {
    public static void main(String[] args) {
        int[][] personsWithAccounts = {
                {1,2,3000},
                {5,6,90000},
                {100, 200, 300}
        };
        int[] result = calculateRichestPerson(personsWithAccounts);
        System.out.println("Richest Person Index with Total: " + Arrays.toString(result));
    }

    // Returns wealthiest person's index
    static int[] calculateRichestPerson(int[][] personsList){
        int richestPersonIndex = -1;
        int highestBalance = 0;
        for (int personIndex = 0; personIndex < personsList.length; personIndex++) {
            int totalBalance = calculateTotalBalance(personsList[personIndex]);

            if(totalBalance > highestBalance){
                richestPersonIndex = personIndex;
                highestBalance = totalBalance;
            }
        }
        return new int[] {richestPersonIndex, highestBalance};
    }

    static int calculateTotalBalance(int[] accountsList){
        int total = 0;
        for(int balance: accountsList){
            total += balance;
        }
        return total;
    }


}

package Recursion.BasicQuestions;

public class PrintTillNumber {
    public static void main(String[] args) {
//        numberTillOne(5);
//        oneTillNumber(1, 5);
//        oneTillNumber(5);
        printBoth(5);
    }
    static void numberTillOne(int number){
        if(number == 0)
            return;
        System.out.println(number);
        numberTillOne(number - 1);
    }

    static void oneTillNumber(int start, int number){

        if(start > number){
            return;
        }
        System.out.println(start);
        oneTillNumber(start+1, number);
    }

    // Efficient way, without changing arguments, understanding recursion
    static void oneTillNumber(int number){
        if(number == 0)
            return;
        oneTillNumber(number - 1);
        System.out.println(number);
    }

    static void printBoth(int number){
        if(number == 0)
            return;
        System.out.println(number);
        printBoth(number - 1);
        System.out.println(number);
    }


}

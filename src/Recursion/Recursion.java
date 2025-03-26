package Recursion;

public class Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int number){
        if(number == 5){
            System.out.println(5);
            return;
        }
        System.out.println(number);
        print(++number);
    }
}

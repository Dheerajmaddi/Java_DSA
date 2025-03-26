package Recursion.BasicQuestions;

public class Sum {
    public static void main(String[] args) {
        System.out.println(add(5));
    }

    static int add(int number){
        if(number == 1){
            return 1;
        }
        return number + add(number - 1);
    }
}

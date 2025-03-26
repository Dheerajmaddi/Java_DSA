package ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println(arr.size());
//
//        arr.add(1);
//        arr.add(5);
//        arr.add(4);
//        arr.add(2);
//        arr.add(10);
//
//        System.out.println(arr.size());
//        System.out.println(arr);
//        arr.set(2, 3);
//        System.out.println(arr);


        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<>(3);

        System.out.println(twoDArray.size());
        for (int row = 0; row < 3; row++) {
            twoDArray.add(new ArrayList<>(3));
        }
        System.out.println(twoDArray.size());

        for (ArrayList<Integer> row: twoDArray){
            for (int column = 0; column < 3; column++) {
                row.add(input.nextInt());
            }
        }

        for (int row = 0; row < twoDArray.size(); row++) {
            System.out.println(twoDArray.get(row));
        }




    }
}

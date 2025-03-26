package Recursion;

public class Patterns {
    public static void main(String[] args) {
//        reverseTriangle(4, 0);
//        System.out.println();
        triangle(4, 0);
    }

    static void reverseTriangle(int row, int column){
        if(row == 0){
            return;
        }

        if(column < row){
            System.out.print("* ");
            reverseTriangle(row, column + 1);
        } else {
            System.out.println();
            reverseTriangle(row - 1, 0);
        }
    }

    static void triangle(int row, int column){
        if(row == 0){
            return;
        }

        if(column < row){
            triangle(row, column + 1);
            System.out.print("* ");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }
}

package Patterns;

public class PatternExamples {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        // pattern5WrongLogic(9); my logic
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//
//        pattern17(4);

        pattern31(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n - row + 1; column++) { // or (row = 0, column < n - row)
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern5WrongLogic(int n){
        int mid = n / 2;
        int top = n - mid;
        for (int row = 1; row <= top; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int lRow = 1; lRow <= mid; lRow++) {
            for (int lColumn = 1; lColumn <= mid - lRow + 1; lColumn++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
    static void pattern5(int n){
        for (int row = 1; row < 2 * n; row++) {
            int totalColumnsInARow = row <= n ? row : 2 * n - row;
            for (int column = 1; column <= totalColumnsInARow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }
    static void pattern28(int n){
        for (int row = 1; row < 2 * n; row++) {

            int totalColumnsInARow = row <= n ? row : 2 * n - row;
//            int totalSpacesInARow = row <= n ? n - row : row - n;
            int totalSpacesInARow = n - totalColumnsInARow;
            for (int sapce = 1; sapce <= totalSpacesInARow; sapce++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= totalColumnsInARow; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int totalSpacesInARow = n - row;
            for (int sapce = 1; sapce <= totalSpacesInARow; sapce++) {
                System.out.print("  ");
            }

            for (int column = row; column >= 1; column--) {
                System.out.print(column + " ");
            }
            for (int column = 2; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalColumnsInARow = row <= n ? row : 2 * n - row;
            int totalSpacesInARow = n - totalColumnsInARow;

            for (int space = 1; space <= totalSpacesInARow; space++) {
                System.out.print(" ");
            }
            for (int column = totalColumnsInARow; column >= 1 ; column--) {
                System.out.print(column);
            }
            for (int column = 2; column <= totalColumnsInARow; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

    static void pattern31(int n){
        int totalRows = 2 * n;
        for (int row = 1; row < totalRows; row++) {

            for (int column = 1; column < totalRows; column++) {
                int left, top;
                left = column;
                int right = totalRows - column;
                top = row;
                int bottom = totalRows - row;
                int atEveryIndex = n - Math.min(Math.min(left, right), Math.min(top, bottom)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
    }

}

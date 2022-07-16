package com.pattern;

public class Patterns {
    public static void main(String[] args){
        pattern1(6);
        pattern2(6);
        pattern3(6);
        pattern4(6);
        pattern5(6);
        pattern6(6);
        pattern7(6);
        pattern8(6);
        pattern9(6);
        pattern10(6);
        pattern11(6);
        pattern12(6);
        pattern13(6);
        pattern14(6);
        pattern15(6);
        pattern17(6);
        pattern18(6);
        pattern19(6);
        pattern20(6);
        pattern21(6);
        pattern22(6);
        pattern23(6);
        pattern24(6);
        pattern25(6);
        pattern26(6);
        pattern27(6);
        pattern28(6);
        pattern29(6);
        pattern30(6);
        pattern31(6);
    }

    public static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern3(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++){
            int totalNoOfCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalNoOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern7(int n){
        for (int row = 1; row <= n; row++) {

            int totalNoOfCols = n - row + 1;

            for (int spaces = 1; spaces <= n - totalNoOfCols; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalNoOfCols; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern8(int n){
        for (int row = 1; row <= n; row++) {

            int totalNoOfCols = 2 * row - 1;

            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalNoOfCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern9(int n){
        for (int row = 1; row <= n; row++) {

            // figure out total no of columns
            int totalNoOfCols = 2 * (n - row + 1) - 1;

            // give appropriate no of spaces.
            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }

            // print that many no of columns.
            for (int col = 1; col <= totalNoOfCols; col++) {
                System.out.print("*");
            }

            // add a new line.
            System.out.println();
        }
        System.out.println();

    }
    
    public static void pattern10(int n){
        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern11(int n){
        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern12(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalNoOfCols = (row > n) ? row - n : n - row + 1;

            for (int spaces = 1; spaces <= n - totalNoOfCols; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalNoOfCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern13(int n){
        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

            // row one contains one star.
            if (row == 1){
                System.out.print("*");
            }else if (row == n){
                for (int j = 1; j <= 2 * n - 1; j++) {
                    System.out.print("*");
                }
            }else{
                // except first and last row all other rows contain two columns.
                System.out.print("*");
                int s = 2 * (row - 1) - 1;
                for (int spaces = 1; spaces <= s; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern14(int n){
        for (int row = 0; row < n; row++) {

            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }

            if (row == 0){
                for (int i = 0; i < 2 * n - 1; i++) {
                    System.out.print("*");
                }
            }else if(row == n-1){
                System.out.print("*");
            }else{
                System.out.print("*");
                int s = 2 * (n - row) - 3 ;
                for (int spaces = 0; spaces < s; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern15(int n){
        for (int row = 0; row < 2 * n - 1; row++) {

            int space = (row >= n) ? (row - n + 1) : n - row - 1;

            for (int spaces = 0; spaces < space; spaces++) {
                System.out.print(" ");
            }

            if (row == 0 || row == 2 * n - 2){
                System.out.print("*");
            } else{
                System.out.print("*");
                int s = (row >= n) ? 2 * (2 * n - row) - 5: 2 * row - 1;
                for (int spaces = 0; spaces < s; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

//    public static void pattern16(int n){
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row ; col++) {
//                System.out.print("1 ");
//                int i = row;
//                for (int nums = 0; nums < row + 1; nums++) {
//                    System.out.print(i + " ");
//
//                }
//            }
//            System.out.println();
//        }
//    }


    public static void pattern17(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalNoOfCol = row > n ? 2*n - row : row;

            for (int spaces = 0; spaces < n-totalNoOfCol; spaces++) {
                System.out.print("  ");
            }

            for (int col = totalNoOfCol; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= totalNoOfCol ; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void pattern18(int n){
        for (int row = 1; row <= 2 * n; row++) {

            int totalNoOfCols = (row > n) ? 2 * (row - n) : 2 * (n - row) + 2;

            for (int cols = 1; cols <= totalNoOfCols/2; cols++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces < 2 * n - totalNoOfCols; spaces++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= totalNoOfCols/2; cols++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern19(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalNoOfCols = (row > n) ? 2 * ( 2 * n - row ) : 2 * row;
            for (int cols = 1; cols <= totalNoOfCols/2; cols++) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces < 2 * n - totalNoOfCols; spaces++) {
                System.out.print(" ");
            }

            for (int cols = 1; cols <= totalNoOfCols/2; cols++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern20(int n){
        for (int row = 1; row <= n; row++) {

            if (row == 1 || row == n){
                for (int cols = 0; cols < n - 1; cols++) {
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int spaces = 0; spaces < n - 3; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern21(int n){
        int i = 1;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern22(int n){

        for (int row = 1; row <= n; row++) {
            int i = row % 2;
            for (int cols = 1; cols <= row; cols++) {
                System.out.print(i + " ");
                i = (i == 1) ? 0:1;
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern23(int n){
        /**
         *
         *
         *
                    *   *
                   * * * *
                  *   *   *

                    *     *
                   * *   * *
                  *   * *   *
                 *     *     *


                   *       *
                  * *     * *
                 *   *   *   *
                *     * *     *
               *       *       *



         *             */

        for (int row = 1; row <= n; row++) {

            // external spaces.
            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }

            if (row == 1){
                System.out.print("*");
                for (int spaces = 1; spaces <= 2 * (n-1) - 1; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            else {
                System.out.print("*");

                for (int spaces = 1; spaces <= 2 * row - 3; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int spaces = 1; spaces <= 2 * (n-row) - 1; spaces++) {
                    System.out.print(" ");
                }

                if (row != n){
                    System.out.print("*");
                }

                for (int spaces = 1; spaces <= 2 * row - 3; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");

            }
            System.out.println();

        }
        System.out.println();

    }

    public static void pattern24(int n){
        for (int row = 1; row <= 2 * n; row++) {

            if (row == 1 || row == 2 * n){
                int s = (row == 1) ? 2 * (n - row) : 2 * (row - n - 1);
                System.out.print("*");
                for (int spaces = 1; spaces <= s; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            else{
                System.out.print("*");

                int internalSpaces = (row > n) ? 2 * n - row - 1: row - 2;

                for (int spaces = 1; spaces <= internalSpaces; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                int externalSpaces = (row > n) ? 2 * (row - n - 1) : 2 * (n - row);

                for (int spaces = 0; spaces < externalSpaces; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int spaces = 1; spaces <= internalSpaces; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
    
    public static void pattern25(int n){

        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            if (row == 1 || row == n){
                for (int col = 0; col < n; col++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int cols = 0; cols < n - 2; cols++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
    
    public static void pattern26(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= n - row + 1; cols++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    
    public static void pattern27(int n){
        int leftIndex = 1;
        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= row - 1; spaces++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(leftIndex + " ");
                leftIndex++;
            }

            int temp = n - row;
            int rightIndex =  2 * temp * (temp + 1)/2 + leftIndex;
            System.out.print("  ");

            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(rightIndex + " ");
                rightIndex++;
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern28(int n){
        for (int row = 1; row <= 2*n-1; row++) {

            // find totalNoOfCol in each row
            int totalNoOfCol = row < n ? row : 2 * n - row;

            // find total no of empty spaces that needed to be printed.
            int spaces = n-totalNoOfCol;

            // print empty spaces.
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }

            // print *
            for (int col = 1; col <= totalNoOfCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void pattern29(int n){
        for (int row = 0; row < 2 * n - 1; row++) {
            int col = (row >= n) ? 2 * n - row - 1: row + 1;
            for (int i = 0; i < col; i++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2 * n - 2 * col; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i < col; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void pattern30(int n){
        for (int row = 1; row <= n ; row++) {

            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
        System.out.println();

    }

    public static void pattern31(int n){
        for (int row = 1; row <= 2 * n-1; row++) {
            for (int col = 1; col <= 2 * n-1; col++) {
                int atEveryIndex = (n+1) - Math.min(Math.min(row,col),Math.min(2 * n - row , 2 * n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
        System.out.println();

    }


}

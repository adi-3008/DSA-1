package com.recursion.pattern;

import java.util.Arrays;

public class pattern {

    public static void main(String[] args){
//        rPattern(4, 0);
//        pattern(1,1,4);
        pattern2(4, 0);
    }

    static void rPattern(int r, int c){
        if (r == 0)
            return;

        // this will print all * in same row until column number is not equal to row no.
        if (r > c) {
            System.out.print("*");
            rPattern(r, c + 1);
        }

        // this condition will be hit only if all columns are printed in a row, and we want to print the next row.
        else {
            System.out.println();
            rPattern(r - 1, 0);
        }
    }

    static void pattern(int r, int c, int n){
        if (r > n)
            return;

        if (c <= n - r + 1){
            System.out.print("*");
            pattern(r, c + 1, n);
        }else {
            System.out.println();
            pattern(r + 1, 1,n);
        }
    }

    static void pattern2(int r, int c){
        if (r == 0)
            return;

        // traverse entire columns and entire row and start printing * from until row become 1.
        if (r > c){
            pattern2(r, c + 1);
            System.out.print("*");
        }else {
            pattern2(r - 1, 0);
            System.out.println();
        }
    }

}

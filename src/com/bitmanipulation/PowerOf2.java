package com.bitmanipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        // check whether number is power of two or not.
        int n = 0;
        boolean ans = (n - (n & -n)) == 0;
        // boolean ans = (n & (n-1)) == 0
        System.out.println(ans);

        /*
            16 is power of two
            10000
          & 01111
          this will give 0 only when number is power of 2.

         */
    }
}

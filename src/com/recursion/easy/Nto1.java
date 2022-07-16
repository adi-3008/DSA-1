package com.recursion.easy;

public class Nto1 {
    public static void main(String[] args){
//        fun(5);
//        funReverse(5);
        funBoth(5);
    }

    // print numbers from n to 1.
    static void fun(int n){
        if (n == 0)
            return;
        System.out.println(n);
        fun(n-1);
    }

    // print number from 1 to n.
    static void funReverse(int n){
        if (n == 0)
            return;
        funReverse(n-1);
        System.out.println(n);
    }

    // print number from n to 1 and again 1 to n.
    static void funBoth(int n){
        if (n == 0)
            return;
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}

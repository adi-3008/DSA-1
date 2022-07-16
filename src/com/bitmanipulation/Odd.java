package com.bitmanipulation;

public class Odd {
    public static void main(String[] args) {
        int a = 44;
        System.out.println(isOdd(a));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}

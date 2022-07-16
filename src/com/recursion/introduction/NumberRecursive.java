package com.recursion.introduction;

public class NumberRecursive {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){

        // base condition
        if (n > 5){
            return;
        }

        // body
        System.out.println(n);

        // recursive call.
        print(n+1);
    }
}

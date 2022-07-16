package com.recursion.easy;

public class DigitProduct {
    public static void main(String[] args){
        int product = digitProduct(12345);
        System.out.println(product);
    }

    static int digitProduct(int n){
        if (n == 0)
            return 1;
        int rem = n % 10;
        return rem * digitProduct(n/10);
    }
}

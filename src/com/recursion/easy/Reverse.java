package com.recursion.easy;

public class Reverse {

    static int sum = 0;

    static void rev1(int num){
        if (num == 0){
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev1(num/10);
    }

    static int rev2(int n){
        if (n%10 == n)
            return n;
        int digits = (int)(Math.log10(n) + 1);
        int rem = n % 10;
        return (int) (rem * Math.pow(10,digits - 1)) + rev2(n/10);
    }

    public static void main(String[] args){
        rev1(1234);
        System.out.println(sum);
        int reverse = rev2(1234);
        System.out.println(reverse);
    }



}

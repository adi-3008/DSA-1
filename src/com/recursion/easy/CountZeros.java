package com.recursion.easy;

public class CountZeros {
    public static void main(String[] args){
        int count = countZeros(3004010);
        System.out.println(count);
    }

    static int countZeros(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if (n == 0)
            return c;
        int rem = n % 10;
        return (rem == 0) ? helper(n / 10, c + 1) : helper(n / 10, c);
    }
}

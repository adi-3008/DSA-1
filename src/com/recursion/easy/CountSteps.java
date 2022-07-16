package com.recursion.easy;

public class CountSteps {
    // count the steps to reach a number to zero if it even divides by 2 and if it is odd subtract by 1

    static int countSteps(int n){
        return helper(n, 0);
    }

    static int helper(int n, int steps){
        if (n == 0)
            return steps;
        return (n % 2 == 0) ? helper(n / 2, ++steps) : helper( n - 1, ++steps);
    }

    public static void main(String[] args){
        int steps = countSteps(41);
        System.out.println(steps);
    }
}

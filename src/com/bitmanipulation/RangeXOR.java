package com.bitmanipulation;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(a-1) ^ xor(b);
        System.out.println(ans);

        int ans1 = 0;
        // just to check the answer is correct or not, it will give time limit exceed(TLE) for large numbers
        for (int i = a; i <= b; i++) {
            ans1 = ans1 ^ i;
        }
        System.out.println(ans1);
    }

    static int xor(int n){
        if (n % 4 == 0){
            return n;
        }

        if (n % 4 == 1){
            return 1;
        }

        if (n % 4 == 2){
            return n+1;
        }

        return 0;
    }
}

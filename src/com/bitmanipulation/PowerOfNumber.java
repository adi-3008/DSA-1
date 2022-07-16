package com.bitmanipulation;

public class PowerOfNumber {
    public static void main(String[] args) {
        int ans = 1;
        int base = 5;
        int power = 2;

        while(power > 0){
            if ((power & 1) == 1){
                ans *= base;
            }
            power = power >> 1;
            base *= base;
        }
        System.out.println(ans);
    }
}

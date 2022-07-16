package com.bitmanipulation;

public class SetResetBit {

    public static void main(String[] args) {
        System.out.println(setToOne(8,3));
        System.out.println(resetToZero(12,3));

    }

    // set i th bit to one.
    static int setToOne(int n, int i){
        int mask = 1 << i - 1;
        return n | mask;
    }

    static int resetToZero(int n, int i){
        int mask = ~ (1 << i - 1);
        return n & mask;
    }
}

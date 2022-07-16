package com.bitmanipulation;

public class WhatIsNthBit {
    public static void main(String[] args) {
        System.out.println(nThBit(12,1));

    }

    static int nThBit(int n, int i){
        int value = 1 << i - 1;
        if ((n & value) == value)
            return 1;
        return 0;
    }
}

package com.bitmanipulation;

import java.util.Arrays;

public class MagicNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(findMagicNumber(i) + " ");
        }
    }

    static int findMagicNumber(int n){
        int magicNumber = 0;
        int placeValue = 5;
        while(n > 0){
            magicNumber += (n & 1) * placeValue;
            n = n >> 1;
            placeValue *= 5;
        }
        return magicNumber;
    }


}

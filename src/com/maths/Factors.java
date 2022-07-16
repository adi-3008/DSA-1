package com.maths;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args){
        int n = 36;
        factors(n);
        System.out.println();
        factors1(n);
        System.out.println();
        factors2(n);
    }

    // Time Complexity  :- O(N)
    // Space Complexity :- O(1)
    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // Time Complexity  :- O(sqrt(N))
    // Space Complexity :- O(1)
    // factors are not in sorted order.
    static void factors1(int n){
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " "+ n/i + " ");
                }
            }
        }
    }

    // Time Complexity  :- O(sqrt(N))
    // Space Complexity :- O(sqrt(N))
    static void factors2(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

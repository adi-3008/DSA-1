package com.temp;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(pascal(4));
    }

    private static List<Integer> pascal(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        if (rowIndex == 0)
            return list;

        for(int i = 1; i <= rowIndex; i++){
            for (int j = i-1; j >= 1; j--) {
                list.set(j, list.get(j-1) + list.get(j));
            }
            list.add(1);
        }
        return list;
    }
}
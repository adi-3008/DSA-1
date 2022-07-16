package com.string;

public class Performance {
    public static void main(String[] args){

        // when we want to add n character in string

        // time complexity of O(N^2).
        String str = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            str = str + ch;
        }
        System.out.println(str);


    }
}

package com.recursion.string;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("","12");
        System.out.println(padRetCount("","12"));
    }

    static void pad(String p, String up){
        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch,up.substring(1));
        }
    }

    static ArrayList<String> padRet(String p, String up){
        if (up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }

    static int padRetCount(String p, String up){
        if (up.length() == 0){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            count = count + padRetCount(p+ch,up.substring(1));
        }
        return count;
    }
}

package com.recursion.string;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        ArrayList<String> list = permutationList("", "abc");
//        System.out.println(list);
//        System.out.println(permutationCount("", "abcd"));
        permutation("", "abc");
    }

    static void permutation(String p, String up){
        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i);
            permutation(s + ch + e, up.substring(1));
        }
    }

    static ArrayList<String> permutationList(String p, String up){

        if (up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            list.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return list;
    }

    static int permutationCount(String p, String up){
        if (up.length() == 0){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += permutationCount(f + ch + s, up.substring(1));
        }

        return count;
    }
}

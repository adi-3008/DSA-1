package com.searching;

public class LinearSearchInString {

    public static void main(String[] args) {
        String name = "aditya";
        System.out.println(search(name,'d'));
    }

    static boolean search(String str, char target){
        if (str.length() == 0)
            return false;

        for (char c: str.toCharArray()) {
            if (c == target)
                return true;
        }

        return false;
    }

    static boolean search2(String str, char target){
        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i))
                return true;
        }

        return false;
    }
}

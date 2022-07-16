package com.string;

public class Palindrome {

    static boolean isPalindrome(String str){
        if (str == null || str.length() == 0)
            return true;

        str = str.toLowerCase();

        for (int i = 0; i <= str.length()/2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-i-1);
            if (start != end)
                return false;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        int start = 0;
        int end = str.length()-1;

        while(start <= end){
            if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
}

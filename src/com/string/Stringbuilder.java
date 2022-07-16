package com.string;

public class Stringbuilder {
    public static void main(String[] args) {

        // when we want to add n character in string time complexity of O(N)
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
        builder.delete(1,4);
        System.out.println(builder);
        builder.deleteCharAt(5);
        System.out.println(builder);
    }
}

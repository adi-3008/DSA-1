package com.string;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+1);
        System.out.println("a"+1);
        // this is same as after few steps "a" + "1"
        // integer will be converted to Integer that will call toString();

        // at least one object should be of type string then resultant expression will be of type string.
        System.out.println("aditya" + new ArrayList<>());
        String ans = new ArrayList<>() +""+ new Integer(4);
        System.out.println(ans);

        // this will not work.
//        System.out.println(new ArrayList<>() + new Integer(65));


    }
}

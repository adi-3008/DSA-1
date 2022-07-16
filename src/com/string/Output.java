package com.string;

public class Output {
    public static void main(String[] args) {
        // internally calls valueOf() method and there by call toString method.
        System.out.println(56);
        System.out.println("aditya");
        System.out.println(new int[]{2,3,4,5});

        Integer num = 45;
        System.out.println(num.toString());
        System.out.println(num);

    }
}

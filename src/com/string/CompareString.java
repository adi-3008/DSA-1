package com.string;

public class CompareString {
    public static void main(String[] args) {
        String name1 = "Aditya";
        String name2 = "Aditya";
        // == check whether objects are same or not.
        System.out.println(name2 == name1);

        // .equals checks whether value is same or not.
        System.out.println(name1.equals(name2));

        String a = new String("Aditya");
        String b = new String("Aditya");
        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println(name1);

        Integer num = 98;
        System.out.println(num);

        System.out.println("aditya");
    }
}

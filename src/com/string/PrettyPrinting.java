package com.string;

public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 453.1234f;
        // rounded off value
        System.out.printf("%.2f",num);
        System.out.println();
        System.out.printf("Pie: %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %.2s and i am %s","aditya","cool");
    }
}

package com.maths;

public class NewtonRaphsonMethod{
    public static void main(String[] args){
        int n = 40;
        double root = newtonSQRT(n);
        System.out.println(root);
    }

    static double newtonSQRT(int n){
        double root;
        double x = n;

        while(true){
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.001){
                break;
            }

            x = root;
        }

        return root;
    }
}

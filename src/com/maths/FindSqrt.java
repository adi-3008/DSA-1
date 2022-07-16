package com.maths;

public class FindSqrt {
    public static void main(String[] args){
        int n = 40;
        int precision = 2;
        double ans  = sqrt(n,precision);
        System.out.println(ans);
    }

    static double sqrt(int n, int precision){

        int start = 0;
        int end = n;


        while(start <= end){
            int middle = start + (end - start)/2;

            if (middle * middle == n){
                return middle;
            }

            if (middle * middle > n){
                end = middle - 1;
            }else
                start = middle + 1;
        }

        double root = end;

        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;

    }
}

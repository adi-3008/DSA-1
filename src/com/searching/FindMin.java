package com.searching;

public class FindMin {
    public static void main(String[] args){
        System.out.println(min(new int[]{3,5,7,3,2,7,32,53,3,77,423}));
    }

    static int min(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int ele:arr ) {
            if (min > ele)
                min = ele;
        }

        return min;
    }
}

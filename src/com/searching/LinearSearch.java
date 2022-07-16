package com.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter number that you want to search");
        int ele = input.nextInt();

        int ans = linearSearch(arr,ele);
        System.out.println(ele +" is present at index "+ans);
    }

    public static int linearSearch(int[] arr, int ele){
        // check array is empty or not.
        if (arr.length == 0)
            return -1;

        // check every element
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == ele)
                return index;
        }
        return -1;
    }
}

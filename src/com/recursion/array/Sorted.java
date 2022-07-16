package com.recursion.array;

public class Sorted {
    // check whether array is sorted or not.
    public static void main(String[] args){
        int[] arr = {1, 3, 6, 49, 16, 34};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    static boolean isSorted(int[] arr, int sIndex){
        if (sIndex == arr.length - 1)
            return true;
        return arr[sIndex] < arr[sIndex + 1] && isSorted(arr,sIndex + 1);
    }
}

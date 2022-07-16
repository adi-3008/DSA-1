package com.recursion.array;

public class RotatedBinarySearch {

    public static void main(String[] args){
        int[] arr = {};
        int target = 584;
        int index = rotatedBinarySearch(arr, 0, arr.length - 1, target);
        System.out.println(index);
    }

    static int rotatedBinarySearch(int[] arr, int s, int e, int target){

        if (s > e)
            return -1;

        int m = s + (e - s) / 2;

        if (arr[m] == target){
            return m;
        }

        if (arr[s] < arr[m]){
            if (target >= arr[s] && target < arr[m])
                return rotatedBinarySearch(arr, s, m - 1, target);
            else
                return rotatedBinarySearch(arr, m + 1, e, target);
        }

        if (target >= arr[m + 1] && target <= arr[e])
            return rotatedBinarySearch(arr, m + 1, e, target);

        return rotatedBinarySearch(arr, s, m - 1, target);
    }
}

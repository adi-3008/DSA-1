package com.searching;

public class IterativeBinarySearch {

    public static int iterativeBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int middle = start + (end-1)/2;

            if (arr[middle] == target)
                return middle;
            else if (arr[middle] > target)
                end = middle-1;
            else if (arr[middle] < target)
                start = middle+1;

        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {23,45,67,74,83,95,304};
        int target = 83;
        int index = iterativeBinarySearch(arr,target);
        System.out.println(index);
    }
}

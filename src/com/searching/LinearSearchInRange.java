package com.searching;

public class LinearSearchInRange {
    public static void main(String[] args){
        int[] arr = {1,2,3,46,22,62,45,75,12};
        int target = 22;
        int start = 3;
        int end = 7;
        System.out.println(search(arr,target,start,end));
    }

    static int search(int[] arr, int target, int start, int end){
        if ((start > end) && (arr.length == 0) && (start < 0) && (end > arr.length-1))
            return -1;

        for (int index = 0; index <= end; index++) {
            if (arr[index] == target)
                return index;
        }

        return -1;

    }
}

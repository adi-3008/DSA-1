package com.searching;

public class CeilingOfNumber {

    static int ceilingOfNumber(int[] arr, int target){


        if (target > arr[arr.length-1])
            return -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int middle = (start+end)/2;

            // best case
            if (arr[middle] == target)
                return target;

            // search space lies in the left of the array
            else if (arr[middle] > target)
                end = middle-1;

            // search space lies in the right of the array.
            else if (arr[middle] < target)
                start = middle+1;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {-23, -4, -3, 0 , 5, 8, 12, 15, 26, 30, 45, 47};
        int target = 6;
        System.out.println(ceilingOfNumber(arr,target));
    }
}
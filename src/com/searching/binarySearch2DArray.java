package com.searching;

import java.util.Arrays;

public class binarySearch2DArray {
    public static int[] binarySearchMatrix(int[][] arr, int target){
        int[] ans = {-1,-1};
        if (arr.length == 0)
            return ans;

        for (int i = 0; i < arr.length; i++){
            int start = i;
            int end = arr[i].length-1;

            while(start <= end){
                int middle = start + (end-start)/2;

                if (arr[i][middle] == target){
                    ans[0] = i;
                    ans[1] = middle;
                    return ans;
                }else if (arr[i][middle] > target)
                    end = middle-1;
                else
                    start = middle+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // array is sorted in row wise and column wise manner.

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {27,34,48,67},
                {38,49,79,102}
        };
        int[] ans = binarySearchMatrix(arr,48);
        System.out.println(Arrays.toString(ans));
    }
}

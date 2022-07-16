package com.searching;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {23,53,15,74,34},
                {83,3,61},
                {27,55,38}
        };

        int target = 55;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{1 + row, 1 + col};
                }

            }
        }

        return new int[]{-1,-1};

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int ele : row) {
                if (ele > max)
                    max = ele;
            }
        }

        return max;
    }


}

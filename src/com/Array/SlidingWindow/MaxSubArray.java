package com.Array.SlidingWindow;

import java.util.Arrays;

public class MaxSubArray {

    // brute force approach O(N^2) time complexity.
    public static int bruteFore(int[] set){

        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < set.length; j++) {
            int currSum = 0;
            for (int k = j; k < set.length; k++) {
                currSum += set[k];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    // like sliding window O(N) time.
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int num : nums) {
            if (currSum < 0)
                currSum = 0;

            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            // if current sum is negative that doesn't contribute in the max
            // sum because it will not maximize the sum.
            // it also marks the boundary of the next sub-array to be examined.
            // for e.g. {1, 2, -4, 3, 5}   currSum unto element -4 is -1, so we will not
            // consider -4 in it consider next sub array starting from 3 so reset
            // currSum to zero.

        }

        return maxSum;
    }

    // using dynamic programming.
    public static int maxSubArray(int[] nums, int i, int mustPeak, int[][] dp){
        if(i >= nums.length)
            return mustPeak == 1 ? 0 : (int)-1e5;
        if (dp[mustPeak][i] != Integer.MIN_VALUE)
            return dp[mustPeak][i];
        if(mustPeak == 1)
            return dp[mustPeak][i] = Math.max(0, nums[i] + maxSubArray(nums, i + 1, 1, dp));
        return dp[mustPeak][i] = Math.max(maxSubArray(nums, i + 1, 0, dp), nums[i] + maxSubArray(nums, i + 1, 1, dp));
    }

    public static int maximumSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int r = 0; r < arr.length; r++){
                if(i != r){
                    currSum += arr[r];
                    maxSum = Math.max(currSum, maxSum);
                    if(currSum < 0)
                        currSum = 0;
                }

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] set = {1, -2, -4, 3, 5};
        System.out.println(bruteFore(set));
        System.out.println(maxSubArray(set));
//        int[][] dp = new int[2][set.length];
//        for(int[] arr : dp)
//            Arrays.fill(arr, Integer.MIN_VALUE);
//        System.out.println(maxSubArray(set, 0, 0, dp));

        int[] arr = {100,30,1,987,400,200,9};
        System.out.println(maximumSum(arr));
    }
}
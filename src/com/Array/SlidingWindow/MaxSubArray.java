package com.Array.SlidingWindow;

public class MaxSubArray {

    // brute force approach O(N^2) time complexity.
    public static int bruteFore(int[] set){
        int ans = set[0];
        for (int j = 0; j < set.length; j++) {
            int temp = 0;
            int maxSum = 0;
            for (int k = j; k < set.length; k++) {
                temp += set[k];
                maxSum = Math.max(maxSum, temp);
            }
            ans = Math.max(ans, maxSum);
        }
        return ans;
    }

    // like sliding window O(N) time.
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;

        for (int num : nums) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            // if current sum is negative that doesn't contribute in the max
            // sum because it will not maximize the sum.
            // it also marks the boundary of the next sub-array to be examined.
            // for e.g. {1, 2, -4, 3, 5}   currSum unto element -4 is -1, so we will not
            // consider -4 in it consider next sub array starting from 3 so reset
            // currSum to zero.
            if (currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] set = {-2, -1, -3, 4,-1, 2, 1, -5, 4};
        System.out.println(bruteFore(set));
        System.out.println(maxSubArray(set));
    }
}
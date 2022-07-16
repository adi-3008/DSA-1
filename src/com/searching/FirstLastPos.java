package com.searching;

import java.util.Arrays;

public class FirstLastPos {
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        if(nums.length == 0 || target > nums[nums.length-1])
            return ans;

        int start = 0;
        int end = nums.length-1;

        if(nums[start] == nums[nums.length-1] && nums[start]== target){
            ans[0] = start;
            ans[1] = end;
        }

        // searching for starting index of target.
        while(start <= end){
            int middle = (start+end)/2;

            if(target > nums[middle])
                start = middle+1;
            else
                end = middle-1;
        }


        if(nums[start] != target){
            return ans;
        }

        ans[0] = start;
        end = nums.length-1;

        // searching for ending index of target
        while(start <= end){
            int middle = (start+end)/2;

            if(target < nums[middle])
                end = middle-1;
            else
                start = middle+1;
        }

        ans[1] = end;

        return ans;
    }

    public static void main(String[] args) {
        int[] ans = searchRange(new int[]{5,7,7,8,8,8,8,8},8);
        System.out.println(Arrays.toString(ans));
    }
}

package com.sorting.cyclicSort;

import java.util.Arrays;

public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else
                i++;
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1)
                return index+1;
        }

        return nums.length+1;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args){
        int[] nums = {5,3,7,2,9};
        System.out.println(firstMissingPositive(nums));
        System.out.println(Arrays.toString(nums));
    }
}

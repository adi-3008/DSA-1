package com.sorting.cyclicSort;

import java.util.Arrays;
public class FindDuplicate {

    public static int findDuplicate(int[] nums){
        int i = 0;

        while(i < nums.length){

            if (nums[i] != i+1){
                int correct = nums[i]-1;
                if (nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
     }

    public static void main(String[] args){
        int[] nums = {5,2,3,5,1,4};
        System.out.println(findDuplicate(nums));;
        System.out.println(Arrays.toString(nums));
    }
}

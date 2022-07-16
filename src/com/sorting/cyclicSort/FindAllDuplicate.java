package com.sorting.cyclicSort;

import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicate {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct])
                    swap(nums,i,correct);
                else{
                    if (correct < i)
                        list.add(nums[i]);
                    i++;
                }
            }else{
                i++;
            }
        }

        return list;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
}

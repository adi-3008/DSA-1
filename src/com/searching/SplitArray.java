package com.searching;

public class SplitArray {
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            int middle = start + (end-start)/2;

            int sum = 0;
            int peices = 1;

            for(int i = 0; i < nums.length; i++ ){
                if(sum + nums[i] > middle){
                    sum = nums[i];
                    peices++;
                }else
                    sum += nums[i];
            }

            if(peices <= m)
                end = middle;
            else
                start = middle+1;
        }

        return start;
    }

    public static void main(String[] args){
        System.out.println(splitArray(new int[]{7,2,5,10,8},2));
    }
}

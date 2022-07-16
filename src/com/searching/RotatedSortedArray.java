package com.searching;

public class RotatedSortedArray {

    public static int search(int[] nums, int target) {
        // find the peak element
        int peak = findPeak(nums);

        int start = 0;
        int end = nums.length-1;

        if (peak == -1)
            return binarySearch(nums,target,start,end);

        if (nums[start] < target)
            return binarySearch(nums,target,start,peak-1);
        else if (nums[peak] == target)
            return peak;
        return binarySearch(nums,target,peak+1,end);
    }

    private static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int middle = start + (end-start)/2;

            if(middle < end && nums[middle] > nums[middle+1])
                return middle;
            else if (middle > start && nums[middle] < nums[middle-1])
                return middle-1;
            else if (nums[middle] >= nums[start])
                start = middle+1;
            else
                end = middle-1;
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int middle = start + (end-start)/2;
            if (nums[middle] == target)
                return middle;
            else if(nums[middle] >= target)
                end = middle-1;
            else
                start = middle+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,0},3));
    }
}

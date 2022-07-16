package com.searching;

public class RotatedSortedArrayDuplicate {
    public static boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length-1);

        int start = 0;
        int end = nums.length-1;

        if(nums[pivot] == target)
            return true;

        if(nums[start] < target)
            return binarySearch(nums,target,start,pivot-1);
        else if(nums[start] == target)
            return true;
        return binarySearch(nums,target,pivot+1,end);

    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int middle = start + (end-start)/2;

            if(middle < end && nums[middle] > nums[middle+1])
                return middle;

            if(middle > start && nums[middle] < nums[middle-1])
                return middle-1;

            if(nums[middle] == nums[start] && nums[start] == nums[end]) {
                if (nums[start] > nums[start + 1])
                    return start;
                start++;
                if (nums[end] < nums[end - 1])
                    return end - 1;
                end--;

            }
            else if(nums[start] < nums[middle] || nums[start] == nums[middle] && nums[middle] > nums[end])
                start = middle+1;
            else
                end = middle-1;
        }

        return -1;
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int middle = start + (end-start)/2;

            if(nums[middle] == target)
                return true;
            if(nums[middle] > target)
                end = middle-1;
            else if(nums[middle] < target)
                start = middle + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(nums,2));
    }
}

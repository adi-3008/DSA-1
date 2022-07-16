package com.recursion.introduction;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3,7,16,28,32,37,52,69,84,103};
        int index = binarySearch(arr,0,arr.length-1,28);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        if (start > end)
            return -1;

        int middle = start + (end - start)/2;

        if (arr[middle] == target)
            return middle;

        else if (arr[middle] > target)
            return binarySearch(arr,start,middle-1,target);

        return binarySearch(arr,middle+1,end,target);
    }
}

package com.searching;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] arr, int target, int start, int end){
        if (start <= end){
            int middle = (start+end)/2;
            if (arr[middle] == target)
                return middle;
            else if(arr[middle] > target)
                return recursiveBinarySearch(arr,target,start,middle-1);
            else if (arr[middle] < target)
                return recursiveBinarySearch(arr,target,middle+1,end);
        }
        return -1;
    }

    public static int recursiveBinarySearch2(int[] arr, int target, int start, int end){
        if (start >= end){
            return -1;
        }

        int middle = (start+end)/2;
        return arr[middle] == target ? middle : arr[middle] > target ? recursiveBinarySearch2(arr,target,start,middle-1) : recursiveBinarySearch2(arr,target,start+1,end);
    }

    public static void main(String[] args){
        int[] arr = {23,45,67,74,83,95,304};
        int target = 83;
        int index = recursiveBinarySearch(arr,target,0,arr.length-1);
        System.out.println(index);

    }
}

package com.searching;

public class FindElementInInfiniteArray {

    public static int searchBinary(int[] arr, int target){
        int start = 0;
        int end = 1;


        // find the bounds
        int newStart = 0;
        while(target > arr[end]){
            newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }


        // find the element in the start and end
        while (start <= end){
            int middle = start + (end-start)/2;

            if (target < arr[middle])
                end = middle-1;
            else if (target > arr[middle])
                start = middle+1;
            else
                return middle;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-23, -4, -3, 0 , 5, 8, 23, 45, 67, 74, 83, 95, 130,182, 199, 240, 273, 286};
        int target = 240;
        System.out.println(searchBinary(arr,target));
    }
}

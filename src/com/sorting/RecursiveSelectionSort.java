package com.sorting;

import java.util.*;
public class RecursiveSelectionSort {

    public static void recursiveSelectionSort(int[] arr, int start, int end){
        if(start == end)
            return;

        // put one minimum element in its correct position
        int min = start;
        for (int i = start+1; i <= end; i++) {
            if(arr[min] > arr[i])
                min = i;
        }
        swap(arr,start,min);

        // reduce the size of the problem to T(n-1). the recurrence relation is T(N) = T(N-1) + O(N)
        recursiveSelectionSort(arr,start+1,end);
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){
        int[] arr = {34,2,12,15,63,47,18};
        recursiveSelectionSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

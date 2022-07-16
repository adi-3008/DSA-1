package com.sorting.cyclicSort;

import java.util.Arrays;
public class CyclicSort {
    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length-1){
            if(arr[i] - 1 != i)
                swap(arr,i,arr[i]-1);
            else
                i++;
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){
        int[] arr = {3,5,2,4,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


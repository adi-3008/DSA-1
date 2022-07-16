package com.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1])
                    swap(arr,j,j-1);
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args){
        int[] arr = {5,3,4,2,1};
        Arrays.sort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

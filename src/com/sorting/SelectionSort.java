package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = findMin(arr,i,arr.length-1);
            swap(arr,min,i);
        }
    }

    public static int findMin(int[] arr, int start, int end){
        int min = start;
        for (int i = start; i <= end; i ++){
            if(arr[min] > arr[i])
                min = i;
        }
        return min;
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,3,9,12,41,-23,0,-54};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

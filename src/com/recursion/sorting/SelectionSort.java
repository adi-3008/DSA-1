package com.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {};
        selectionSort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int pass, int j, int max){
        if (pass >= arr.length - 1)
            return;

        if (j <= arr.length - pass - 1){
            if (arr[max] < arr[j])
                max = j;
            selectionSort(arr, pass, j + 1, max);
        }

        else {
            swap(arr, max, arr.length - pass - 1);
            selectionSort(arr, pass + 1, 0, 0);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

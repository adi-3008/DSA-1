package com.recursion.sorting;

import java.util.Arrays;

public class QuickSortRBR {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int s, int e){
        if (s >= e)
            return;

        int pivot = partition(arr, s, e);
        quickSort(arr, s, pivot - 1);
        quickSort(arr, pivot + 1, e);
    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[e];

        int j = s;
        int i = j - 1;

        for (j = s; j < e; j++) {
            if (arr[j] < pivot)
                swap(arr, ++i, j);
        }

        swap(arr, ++i, e);

        return i;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

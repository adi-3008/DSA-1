package com.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j <= arr.length - i - 2 ; j++) {
                if (arr[j] > arr[j + 1]){
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!swapped)
                return;
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

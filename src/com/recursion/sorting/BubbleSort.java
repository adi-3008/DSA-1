package com.recursion.sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr, int passes, int c, boolean swapped){
        if (passes >= arr.length || !swapped){
            return;
        }

        if (c < arr.length - passes - 1){
            swapped = false;
            if (arr[c] > arr[c + 1]){
                swap(arr, c, c + 1);
                swapped = true;
            }
            bubbleSort(arr, passes, c + 1, swapped);
        }else {
            bubbleSort(arr, passes + 1,0 ,swapped);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr, 0, 0, true);
        System.out.println(Arrays.toString(arr));
    }
}

package com.temp;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {


    static ArrayList<Integer> list = new ArrayList<>();
    
    public static ArrayList<Integer> countBits(int n) {
        
        if (n == 0){
            list.add(0);
            return list;
        }
        
        list = countBits(n-1);
        list.add(countSetBits(n));
        return list;
    }
    
    public static int countSetBits(int n){
        if (n == 0)
            return 0;
        return (n & 1) + countSetBits(n >> 1);
    }

    public static void main(String[] args){
        int[] arr ={5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e){
        // if array is of size 1 then it is already sorted.
        if (s >= e)
            return;

        // if array is not size 1 then divide it in two equal parts
        int m = s + (e - s) / 2;

        // sort left part of the array.
        mergeSort(arr, s, m);

        // sort right part of the array.
        mergeSort(arr, m + 1, e);

        // merge two sorted array.
        merge(arr, s, m, e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= m){
            mix[k] = arr[i];
            i++;k++;
        }

        while (j <= e){
            mix[k] = arr[j];
            j++;k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }


    static void quickSort(int[] arr, int s, int e){
        if (s >= e)
            return;

        // find the pivot element and put it in its correct position.
        int pivot = partition(arr, s, e);

        // sort the left part of the array.
        quickSort(arr, s, pivot - 1);

        // sort right part of the array.
        quickSort(arr, pivot + 1, e);
    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int l = s - 1;
        for (int i = s; i < e; i++) {
            if (arr[i] < pivot){
                swap(arr, ++l, i);
            }
        }

        swap(arr, ++l, e);

        return l;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
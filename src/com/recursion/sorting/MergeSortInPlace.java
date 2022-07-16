package com.recursion.sorting;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if (s >= e)
            return;

        int m = (s + e) / 2;

        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m + 1, e);

        mergeInPlace(arr,s,m,e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){

        int[] mix = new int[e - s + 1];

        int i =  s;
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
            i++;
            k++;
        }

        while (j <= e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}

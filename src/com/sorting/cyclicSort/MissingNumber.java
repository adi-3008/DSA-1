package com.sorting.cyclicSort;

import java.util.Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }

        return arr.length;
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args){
        int[] arr = {6,0,4,3,7,1,5};
        System.out.println(findMissingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
}

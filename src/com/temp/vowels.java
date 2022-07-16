package com.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.sorting.BubbleSort.swap;

public class vowels {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> list = subset2(new ArrayList<>(), new int[]{1,2,3}, 0);
////        subset1(list, new ArrayList<>(), new int[]{1,2,3}, 0);
//
//
//        for (ArrayList<Integer> list1: list) {
//            System.out.println(list1);
//        }

//        boolean[][] maze = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true},
//        };
//        int[][] path = new int[maze.length][maze[0].length];
//        allPathPrint("",0,0,maze,path,1);

        int[] arr = {5,4,3,2,1};
        bubbleSort14(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr, j, j + 1);
            }
        }
    }

    static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped){
                return;
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    static int getMax(int[] arr, int s, int e){
        int max = 0;
        for (int i = s; i <= e; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        return max;
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int binarySearch(int[] arr, int target, int s, int e){
        if (s > e)
            return -1;

        int m = s + (e - s) / 2;

        if (target == arr[m])
            return m;

        if (target > arr[m])
            return binarySearch(arr, target, s, e - 1);

        return binarySearch(arr, target, m + 1, e);
    }

    static void fibo(int n){
        int prev = 0;
        int curr = 1;
        int next;

        for (int i = 2; i <= n; i++) {
            next = curr + prev;
            prev = curr;
            curr = next;
        }

        System.out.println(curr);
    }

    static int fibo1(int n){

        if (n < 2)
            return n;

        return fibo1(n-1) + fibo1(n-2);
    }

    static boolean isSorted(int[] arr, int s){
        if (s == arr.length - 1)
            return true;

        return (arr[s] < arr[s + 1]) && isSorted(arr, s + 1);
    }

    static int countSetBits(int n){
        if (n == 0)
            return 0;
        return (n & 1) + countSetBits(n >> 1);
    }

    static void sieve(int n){
        boolean[] arr = new boolean[n+1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]){
                for (int j = 2; i*j <= n; j++) {
                    arr[i*j] = true;
                }
            }
        }

        for (int i = 2; i < arr.length ; i++) {
            if (!arr[i]){
                System.out.print(i + " ");
            }
        }
    }

    static void mergeSort(int[] arr, int s, int e){
        if (s >= e)
            return;

        int m = s + (e - s) / 2;

        mergeSort(arr, s, m - 1);
        mergeSort(arr, m + 1, e);

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
            k++;i++;
        }

        while(j <= e){
            mix[k] = arr[j];
            k++;j++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }

    static void insertionSort1(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int max = findMax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int findMax(int[] arr, int s, int e){
        int max = s;
        for (int i = s + 1; i <= e; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void quickSort(int[] arr, int s, int e){
        if (s >= e)
            return;

        int pivot = partition(arr, s, e);
        quickSort(arr, s, pivot - 1);
        quickSort(arr, pivot + 1, e);
    }

    static int partition(int[] arr, int s, int e){
        int j = s;
        int i = j - 1;

        for (j = 0; j <= e - 1; j++) {
            if (arr[j] < arr[e]){
                swap(arr, ++i, j);
            }
        }

        swap(arr, ++i, e);

        return i;
    }

    static void subsequence(String p, String up){
        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static void subset(ArrayList<Integer> list1, int[] up, int i){
        if (i == up.length){
            list.add(list1);
            return;
        }

        int e = up[i];
        ArrayList<Integer> temp = new ArrayList<>(list1);
        subset(list1, up, i + 1);
        temp.add(e);
        subset(temp, up, i + 1);
    }


    static void subset1(ArrayList<ArrayList<Integer>> list , ArrayList<Integer> list1, int[] up, int i){
        if (i == up.length){
            list.add(list1);
            return;
        }

        int e = up[i];
        ArrayList<Integer> temp = new ArrayList<>(list1);
        subset1(list, list1, up, i + 1);
        temp.add(e);
        subset1(list, temp, up, i + 1);
    }

    static ArrayList<ArrayList<Integer>> subset2(ArrayList<Integer> list1, int[] up, int i){
        if (i == up.length){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(list1);
            return list;
        }

        int e = up[i];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>(list1);
        list = subset2(list1, up, i + 1);
        temp.add(e);
        list.addAll(subset2(temp, up, i + 1));
        return list;
    }


    static void allPathPrint(String p, int r, int c, boolean[][] maze, int[][] path, int step){
        if (r == maze.length - 1 &&  c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c])
            return;
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1){
            allPathPrint(p + "D", r + 1, c, maze, path, step + 1);
        }
        if (c < maze[0].length - 1){
            allPathPrint(p + "R", r, c + 1, maze, path, step + 1);
        }
        if (r > 0){
            allPathPrint(p + "U", r - 1, c, maze, path, step + 1);
        }
        if (c > 0){
            allPathPrint(p + "L", r, c - 1, maze, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }

    public static void bubbleSort14(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }

}



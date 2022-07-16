package com.recursion.array;

import java.util.ArrayList;

public class LinearSearch {
    
    public static void main(String[] args){
        int[] arr = {1, 3, 6, 49, 16, 49, 34};

//        int target = 49;
//        int index = linearSearch(arr,0,target);
//        System.out.println(target + " is present at index : " + index);
//        System.out.println(target + " is present at index : " + linearSearchFromLast(arr,arr.length-1,49));
//        System.out.println(isPresent(arr,0,49));

        ArrayList<Integer> list = findAllIndices1(arr,49,0);
        ArrayList<Integer> list1 = findAllIndices2(arr,49,0);
//        System.out.println(list);
        System.out.println(list1);

    }

    static int linearSearch(int[] arr, int sIndex, int target){
        if (sIndex == arr.length)
            return -1;
        return (arr[sIndex] == target) ? sIndex : linearSearch(arr, sIndex + 1, target);
    }

    static int linearSearchFromLast(int[] arr, int sIndex, int target){
        if (sIndex == arr.length)
            return -1;
        return (arr[sIndex] == target) ? sIndex : linearSearchFromLast(arr, sIndex - 1, target);
    }

    static boolean isPresent(int[] arr, int sIndex, int target){
        if (sIndex == arr.length)
            return false;
        return arr[sIndex] == target || isPresent(arr, sIndex + 1, target);

    }

    static ArrayList<Integer> findAllIndices(int[] arr, int target, int sIndex, ArrayList<Integer> list){

        if (sIndex == arr.length)
            return list;

        if (arr[sIndex] == target)
            list.add(sIndex);

        return findAllIndices(arr, target, sIndex + 1, list);
    }

    static ArrayList<Integer> findAllIndices1(int[] arr, int target, int sIndex){

        if (sIndex == arr.length)
            return new ArrayList<>();

        ArrayList<Integer> list = findAllIndices1(arr, target, sIndex + 1);

        if (arr[sIndex] == target)
            list.add(sIndex);

        return list;

    }

    static ArrayList<Integer> findAllIndices2(int[] arr, int target, int sIndex){

        ArrayList<Integer> list = new ArrayList<>();

        if (sIndex == arr.length)
            return list;

        if (arr[sIndex] == target)
            list.add(sIndex);

        ArrayList<Integer> answerFromBelow = findAllIndices2(arr, target, sIndex + 1);
        list.addAll(answerFromBelow);

        return list;

    }
}

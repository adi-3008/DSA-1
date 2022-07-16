package com.searching;

public class NextGreatestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int middle = (start+end)/2;

            // reduce the search space in the right of middle.
            if(target > letters[middle] || target == letters[middle]){
                start = middle+1;
            }

            // reduce the search space in the left of middle.
            else {
                end = middle-1;
            }
        }

        return letters[start % letters.length];

    }

    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,'j'));
    }
}

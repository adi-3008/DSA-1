package com.bitmanipulation;

import java.util.Arrays;

class Solution {
        public static int[][] flipAndInvertImage(int[][] image) {
            for (int[] ints : image) {
                reverse(ints);
            }
            return image;
        }
        
        static void reverse(int[] image){
            int start = 0;
            int end = image.length-1;
            while(start <= end){
                swap(image,start,end);
                start++;
                end--;
            }
        }
        
        static void swap(int[] image, int first, int second){
            int temp = image[first];
            image[first] = image[second] ^ 1;
            image[second] = temp ^ 1;
        }
    
        public static void main(String[] args) {
            int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
            image = flipAndInvertImage(image);
            for (int[] arr:image) {
                System.out.println(Arrays.toString(arr));
            }
        }
    }
package com.searching;

import java.util.Arrays;

public class BinarySearchMatrix {

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int cMid = cStart + (cEnd-cStart)/2;
            if (matrix[row][cMid] == target)
                return new int[] {row,cMid};
            else if (matrix[row][cMid] > target)
                cEnd = cMid-1;
            else
                cStart = cMid+1;
        }
        return new int[] {-1,-1};
    }

    public static int[] search(int[][] matrix, int target){
        int[] ans = {-1,-1};

        int rStart = 0;
        int rEnd = matrix.length-1;
        int cStart = 0;
        int cEnd = matrix[0].length-1;
        int cMid = cStart + (cEnd-cStart)/2;

        if (matrix.length == 1)
            return binarySearch(matrix,0,0,cEnd,target);


        while(rStart != rEnd-1){
            int rMid = rStart + (rEnd-rStart)/2;
            if (matrix[rMid][cMid] == target)
                return new int[]{rMid,cMid};
            else if(matrix[rMid][cMid] > target)
                rEnd = rMid;
            else
                rStart = rMid;
        }

        if (matrix[rStart][cMid] == target)
            return new int[]{rStart, cMid};
        if (matrix[rStart+1][cMid] == target)
            return new int[]{rStart+1,cMid};

        // search in first half.
        if (matrix[rStart][cMid-1] >= target){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }

        if (matrix[rStart][cMid+1] <= target && target >= matrix[rStart][cEnd])
            return binarySearch(matrix,rStart,cMid+1,cEnd,target);

        if (matrix[rStart+1][cMid] >= target)
            return binarySearch(matrix,rStart+1,0,cMid-1,target);

        else
            return binarySearch(matrix,rStart+1,cMid+1,cEnd,target);



    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,   14,  27,  45},
                {58,  62,  68,  75},
                {84,  86,  93,  104},
                {116, 137, 143, 178}
        };

        int[] ans = search(arr,1);

        System.out.println(Arrays.toString(ans));

    }
}

package com.searching;

import java.util.Arrays;

public class FirstLastPos2 {

    public static int[] searchRange(int[] numbs, int target) {
        int[] ans = {-1, -1};

        // check for first occurrence
        ans[0] = search(numbs, target, true);
        // check for last occurrence
        if (ans[0] != -1){
            ans[1] = search(numbs, target, false);
        }

        return ans;
    }

    public static int search(int[] numbs, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbs.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < numbs[mid])
                end = mid - 1;
            else if (target > numbs[mid])
                start = mid + 1;
            else {
                // potential answer found
                ans = mid;
                if (findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = searchRange(new int[]{5,7,7,8,8,8,8,8},8);
        System.out.println(Arrays.toString(ans));
    }
}

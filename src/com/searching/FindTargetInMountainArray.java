package com.searching;

public class FindTargetInMountainArray {
    public static int findInMountainArray(int target) {

        // find the peak index.
        int peak = findPeakIndex();                // O(logn)

        int index1 = -1;
        int index2 = -1;
        int index3 = -1;


        // find the element in the right side of the peak element
        index1 = binarySearch(target, true,peak);     // O(logn)

        // find the element in the left side of the peak element
        index2 = binarySearch(target, false,peak);     // O(logn)

        // the least index.
        if (index2 != -1)
            return index2;

        // if target element is the peak element
        if(target == MountainArray.get(peak))
            index3 = peak;

        if (index1 == -1 && index3 == -1)
            return Math.min(index1,index3);

        else return Math.max(index1, index3);

    }


    public static int findPeakIndex(){
        int start = 0;
        int end = MountainArray.length()-1;

        while(start < end){
            int middle = start + (end-start)/2;

            if(MountainArray.get(middle) > MountainArray.get(middle+1))
                end = middle;
            else if(MountainArray.get(middle) < MountainArray.get(middle+1))
                start = middle+1;
        }

        return start;
    }

    public static int binarySearch(int target, boolean rightSideArray, int peak){
        int start = 0;
        int end = 0;

        if(rightSideArray){
            start = peak+1;
            end = MountainArray.length()-1;
        }else{
            end = peak-1;
        }

        while(start <= end){
            int middle = start + (end-start)/2;

            if(target < MountainArray.get(middle)){
                if(rightSideArray){
                    start = middle+1;
                }else{
                    end = middle-1;
                }
            }

            else if(target > MountainArray.get(middle))
                if(rightSideArray){
                    end = middle-1;
                }else{
                    start = middle+1;
                }
            else if(target == MountainArray.get(middle))
                return middle;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findInMountainArray(3));
    }
}

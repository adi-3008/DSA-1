package com.recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args){
//        String str = "applagf";
//        str = skipAppNotApple(str);
//        System.out.println(str);

//        String s = "abc";
//        System.out.println(subsSeqReq("", s));
//        subseqAscii("",s);
//        List<List<Integer>> list = subsetDuplicate(new int[]{1,2,2});
//        System.out.println(list);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        subset1(list, new ArrayList<>(), new int[]{1, 2, 3}, 0);
        System.out.println(list);
    }

    // skip a particular character and return the output.
    static String skip(String str){
        if (str.length() == 0)
            return "";

        char ch = str.charAt(0);
        if (ch == 'a'){
            return skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }

    // skip a particular character and print the output
    static void skip(String p, String up){

        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        if (up.charAt(0) == 'a'){
            skip(p ,up.substring(1));
        }else {
            skip(p + up.charAt(0), up.substring(1));
        }
    }

    static String skipApple(String up){
        if (up.length() == 0)
            return "";

        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // skip the sequence of character in string and return the output
    static String skipAppNotApple(String up){

        if (up.length() == 0){
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple"))
            return skipAppNotApple(up.substring(3));
        else{
            String s1 = skipAppNotApple(up.substring(1));
            return up.charAt(0) + s1;
        }

    }

    // write all possible subsequences of a string.
    static void subseq(String p, String up){

        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // write all possible subsequences of a string and return list of it.
    static ArrayList<String> subsSeqReq(String p, String up){

        if (up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsSeqReq(p + ch, up.substring(1));
        ArrayList<String> right = subsSeqReq(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    // write all possible subsequences of a string with ascii value.
    static void subseqAscii(String p, String up){

        if (up.length() == 0){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subsSeqReqAscii(String p, String up){

        if (up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subsSeqReqAscii(p + ch, up.substring(1));
        ArrayList<String> second = subsSeqReqAscii(p, up.substring(1));
        ArrayList<String> third = subsSeqReqAscii(p, up.substring(1));


        first.addAll(second);
        first.addAll(third);

        return first;
    }

    static List<List<Integer>> subsetIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        for (int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i-1])
                start = end + 1;

            // before copying the subsets end should be updated to the current size of the outer list.
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }


    static List<List<Integer>> subsetDuplicate1(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i-1])
                start = end + 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
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
        list1.add(e);
        subset1(list, list1, up, i + 1);
        list1.remove(list1.size() - 1);
        subset1(list, list1, up, i + 1);
    }

    static ArrayList<ArrayList<Integer>> subset2(ArrayList<Integer> list1, int[] up, int i){
        if (i == up.length){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(list1);
            return list;
        }

        int e = up[i];
        ArrayList<Integer> temp = new ArrayList<>(list1);

        ArrayList<ArrayList<Integer>> left = subset2(list1, up, i + 1);
        temp.add(e);
        ArrayList<ArrayList<Integer>> right = subset2(temp, up, i + 1);
        left.addAll(right);
        return left;
    }

}

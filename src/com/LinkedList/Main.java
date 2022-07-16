package com.LinkedList;

import java.util.LinkedList;

import static com.LinkedList.LL.mergeSortedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
////        list.display();
////        list.insert(100, 0);
//        list.insertRec(56, 3);
//        list.display();

//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.display();
//        list.duplicate();
//        list.display();

//        LL list1 = new LL();
//        list1.insertLast(1);
//        list1.insertLast(3);
//        list1.insertLast(5);
//        list1.insertLast(7);
//        list1.display();
//        System.out.println();
//
//        LL list2 = new LL();
//        list2.insertLast(1);
//        list2.insertLast(4);
//        list2.insertLast(9);
//        list2.insertLast(13);
//        list2.display();
//        System.out.println();
//
//        LL ans = mergeSortedList(list1, list2);
//        ans.display();







//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(1));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
////        list.display();
////        list.insertLast(99);
//        list.display();
//        list.insert(8,65);
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(76);
//        list.insert(143);
//        list.display();
//        System.out.println(list.delete(143));
//        list.display();
//        System.out.println(list.delete(76));
//        list.display();
//        System.out.println();

        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        long s = 2;
        long e = x;
        long m = 0;
        while(s <= e){
            m = s + (e-s)/2;

            if(m*m < x){
                s = m + 1;
            }else if (m*m == x){
                return (int)(m);
            } else{
                e = m - 1;
            }
        }

        return (int)(e);
    }
}

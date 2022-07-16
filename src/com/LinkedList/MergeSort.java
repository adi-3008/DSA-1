package com.LinkedList;
import com.LinkedList.InterviewQuestion.ListNode;

public class MergeSort {

    ListNode mergeSort(ListNode head){
        if (head == null || head.next == null)
            return head;

        ListNode mid = getMid(head);
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(mid);
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode head = new ListNode();
        ListNode tail = head;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }else{
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            }
        }

        tail.next = (list1 == null) ? list2:list1;
        return head.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }



}

package com.LinkedList;

class Solution {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int val) {
      this.val = val;
      next = null;
    }

    ListNode(int val, ListNode node){
      this.val = val;
      next = node;
    }
  }

  public static ListNode insertionSortList(ListNode head) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy; // the last (largest) of the sorted list

    while (head != null) {       // current inserting node
      ListNode next = head.next; // cache next inserting node
      if (prev.val >= head.val)  // prev >= current inserting node
        prev = dummy;            // move prev to the front
      while (prev.next != null && prev.next.val < head.val)
        prev = prev.next;
      head.next = prev.next;
      prev.next = head;
      head = next; // update current inserting node
    }

    return dummy.next;
  }

  public static void main(String[] args) {

    ListNode node = new ListNode(1, null);
    ListNode node1 = new ListNode(2, node);
    ListNode node2 = new ListNode(3, node1);
    ListNode node3 = new ListNode(4, node2);
    ListNode head = new ListNode(5, node3);

    display(head);
    insertionSortList(head);
    display(head);

  }

  public static void display(ListNode head){
    ListNode temp = head;
    while (temp != null){
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }


}
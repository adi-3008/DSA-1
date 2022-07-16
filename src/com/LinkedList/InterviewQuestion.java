package com.LinkedList;


public class InterviewQuestion {

    ListNode head;
    ListNode tail;
    int size;

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


    // detect cycle
    public boolean hasCycle() {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                // cycle is present.
                int length = 0;
                do{
                    slow = slow.next;
                    length++;
                }while(slow != fast);
                return length;
            }
        }

        return -1;
    }

    public ListNode detectCycle(){
        ListNode first = head;
        ListNode second = head;

        int length = lengthOfCycle();
        if (length == 0)
            return null;

        while (length > 0){
            first = first.next;
            length--;
        }

        while (first != second){
            first = first.next;
            second = second.next;
        }

        return first;
    }

    // recursion reversal of Linked list
    private void reverse(ListNode node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list.
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return head;

        tail = head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }

    // reverse subpart of the linked list.
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)
            return head;

        ListNode prev = null;
        ListNode current = head;

        // skip left-1 nodes.
        for(int i = 0; current != null && i < left - 1; i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;

        return head;
    }

    public ListNode reverseKNodes(ListNode head, int k){
        if (k <= 1 || head == null)
            return head;

        ListNode prev = null;
        ListNode current = head;
        int count = sizeOfList(head)/(2 * k);

        while (count > 0){

            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }

            if (last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;
            prev = newEnd;
            count--;
        }

        return head;
    }

    public ListNode reverseAlternateKGroups(ListNode head, int k){
        if (head == null || k <= 1)
            return head;

        ListNode prev = null;
        ListNode current = head;
        int count = sizeOfList(head)/(2 * k);

        while (count > 0 && current != null){
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                    next = next.next;
            }

            if (last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;
            prev = newEnd;

            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }

            count--;
        }
        return head;
    }

    int sizeOfList(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return headSecond == null;
    }

    public void insertFirst(int value){
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;
    }

    // insert in the last.
    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // display linked list.
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // happy number
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        return slow == 1;
    }

    public static int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem*rem;
            n = n / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        InterviewQuestion list = new InterviewQuestion();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(10);
        list.insertLast(11);
        list.insertLast(12);
        list.insertLast(13);
        list.insertLast(14);



//        list.tail.next = list.head.next.next;
//        System.out.println(list.hasCycle());
//        System.out.println(list.lengthOfCycle());
//        System.out.println(list.detectCycle().val);
//        //list.display();
//        boolean ans = isHappy(19);
//        System.out.println(ans);

//        boolean isPalindrome = list.isPalindrome(list.head);
//        System.out.println(isPalindrome);
        list.display();
        list.head = list.reverseAlternateKGroups(list.head, 3);
        list.display();
    }


}





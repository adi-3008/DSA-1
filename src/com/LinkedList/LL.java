package com.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }

    // insert in the first
    public void insertFirst(int value){
        Node node = new Node(value);
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
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert in between.
    public void insert(int value, int index){

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // insert a node using recursion.
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node){
        if (index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    // display linked list.
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // delete first element
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return value;
    }

    // delete last element.
    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node temp = get(size-2);
        int value = tail.value;
        tail = temp;
        tail.next = null;
        size--;
        return value;
    }

    // delete any element
    public int delete(int index){
        if (index == 0)
            return deleteFirst();
        if (index == size - 1)
            return deleteLast();

        Node temp = get(index - 1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    // find the node with given value and return it.
    public Node find(int value){
        Node temp = head;
        while (temp != null){
            if (temp.value == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // return the node at given index.
    public Node get(int index){

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // delete duplicate element.
    public void duplicate(){
        Node node = head;
        while (node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL mergeSortedList(LL list1, LL list2){
        LL ans = new LL();
        Node node1 = list1.head;
        Node node2 = list2.head;

        while (node1 != null && node2 != null){
            if (node1.value > node2.value){
                ans.insertLast(node2.value);
                node2 = node2.next;
            }else{
                ans.insertLast(node1.value);
                node1 = node1.next;
            }
        }

        ans.tail.next = (node1 != null) ? node1 : node2;
        ans.tail = (node1 != null) ? list1.tail : list2.tail;

        return ans;
    }

    // find the middle node.
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void bubbleSort(){
        bubbleSort(size - 1, 0);
    }

    void bubbleSort(int row, int col){
        if (row == 0)
            return;

        if (col < row){

            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value){
                if (first == head){
                    first.next = second.next;
                    second.next = first;
                    head = second;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                if (first.next == null){
                    tail = first;
                }
            }
            bubbleSort(row, col + 1);
        }else {
            bubbleSort(row-1,0);
        }
    }

    // recursion reversal of Linked list
    private void reverse(Node node){
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
    public void reverseList() {

        if (head == null)
            return;

        tail = head;
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    // creating a node.
    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
//        list.display();
//        list.bubbleSort();
        list.display();
        list.reverse(list.head);
        list.display();
    }
}

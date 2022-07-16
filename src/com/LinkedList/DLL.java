package com.LinkedList;

public class DLL {

    Node head;

    public void insertFirst(int value){
        Node temp = new Node(value);
        temp.next = head;
        temp.prev = null;
        if (head != null)
            head.prev = temp;
        head = temp;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node temp = head;
        node.next = null;

        if (temp == null){
            head = node;
            head.prev = null;
        }

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;

    }

    public void insert(int after, int value){
        Node prev = find(after);
        Node node = new Node(value);
        if (prev == null){
            return;
        }
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        if (node.next == null)
            return;
        node.next.prev = node;
    }

    public Node find(int after){
        Node temp = head;
        while (temp != null){
            if (temp.value == after)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }

    private class Node{
        int value;
        Node prev;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}

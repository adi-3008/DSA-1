package com.LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        tail = head;
        return value;
    }

    public int deleteLast(){
        Node node = head;
        if (head == tail){
            int value = node.value;
            head = null;
            tail = null;
            return value;
        }
        while (node.next != tail){
            node = node.next;
        }
        int value = tail.value;
        node.next = tail.next;
        tail = node;
        return value;
    }

    public int delete(int value){
        Node node = head;
        if (node.value == value){
            return deleteFirst();
        }

        if (tail.value == value){
            return deleteLast();
        }

        do {
            if (node.next.value == value){
                node.next = node.next.next;
                return value;
            }
            node = node.next;
        }while (node.next != tail);

        return -1;
    }

    public void display(){
        Node node = head;
        if (head == null)
            return;
        do{
            System.out.print(node.value + " -> ");
            node = node.next;
        }while (node != head);
        System.out.println("HEAD");
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}

package com.queue;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 5;
    protected int size = 0;

    protected int front = 0;
    protected int end = 0;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i = (i+1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

}

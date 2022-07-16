package com.queue;

import com.stack.StackException;

public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 5;

    int end = 0;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean enqueue(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int dequeue() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int removed = data[0];
        System.arraycopy(data, 1, data, 0, data.length - 1);
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}

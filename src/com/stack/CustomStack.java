package com.stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 34;
    int ptr = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.print("Stack OverFlow");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from empty stack!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from empty stack!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}

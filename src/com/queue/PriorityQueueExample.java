package com.queue;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

public class PriorityQueueExample{

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        queue.add(new Student("Prajwal",1));
        queue.add(new Student("Aditya",3));
        queue.add(new Student("Prakash",2));

        System.out.println(queue);



    }
}

class Student implements Comparable<Student>{
    String name;
    int rank;

    Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (this.rank < o.rank)
            return 1;
        else if (this.rank > o.rank)
            return -1;
        return 0;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.rank;
    }
}

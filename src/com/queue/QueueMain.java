package com.queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//
//        queue.enqueue(3);
//        queue.enqueue(6);
//        queue.enqueue(5);
//        queue.enqueue(19);
//        queue.enqueue(1);
//
//        queue.display();
//
//        System.out.println(queue.dequeue());
//
//        queue.display();

//        CircularQueue circularQueue = new CircularQueue(5);
//        circularQueue.enqueue(3);
//        circularQueue.enqueue(6);
//        circularQueue.enqueue(5);
//        circularQueue.enqueue(19);
//        circularQueue.enqueue(1);
//
//        circularQueue.display();
//
//        System.out.println(circularQueue.dequeue());
//        circularQueue.enqueue(13);
//
//
//        circularQueue.display();

        DynamicQueue dynamicQueue = new DynamicQueue(5);
        dynamicQueue.enqueue(3);
        dynamicQueue.enqueue(6);
        dynamicQueue.enqueue(5);
        dynamicQueue.enqueue(19);
        dynamicQueue.enqueue(1);
        dynamicQueue.enqueue(56);
        dynamicQueue.display();

    }
}

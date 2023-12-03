package com.company.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/** Deque (double-ended queue) interface in Java is a subinterface of the Queue interface
and extends it to provide a double-ended queue, which is a queue that allows elements to be added and removed from both ends **/
public class DequeEx {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}

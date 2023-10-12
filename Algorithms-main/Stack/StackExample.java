package com.company.stack;
import java.util.Stack;
/** stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle, which means that the last element added to the stack is the first one to be removed **/
public class StackExample {
    public static void main(String[] args) {
        //LIFO
        //push
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);

        //peek - show top element
        Integer element =  stack.peek();
        System.out.println("Element on stack top: " + element);

        //search an element
        Integer pos = stack.search(1);
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);

        //pop or remove
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //extended from vector so easy implementation, can use vector methods also;
        stack.add(4);
        System.out.println(stack.capacity());

        /** The Stack class in Java is a legacy class and inherits from Vector in Java. It is a thread-safe class and hence involves overhead when we do not need thread safety **/
    }
}

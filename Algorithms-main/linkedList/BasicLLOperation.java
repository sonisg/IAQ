package com.company.linkedList;

import java.util.LinkedList;

public class BasicLLOperation {
    public static void main(String args[])
    {
        // Creating object of the class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addFirst("Z");
        ll.addLast("C");
        System.out.println(ll);

        ll.remove("B");
        System.out.println(ll);

        ll.add(2, "S");
        System.out.println("Updated list: " + ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
    }
}

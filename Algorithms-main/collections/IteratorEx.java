package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String args[]) {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<Integer> al = new ArrayList<>();

        // Adding elements to object of List interface
        // Custom elements
        al.add(2);
        al.add(7);
        al.add(9);

        System.out.println(al);

        // Checking the next element  where
        // condition holds true till there is single element
        // in the List using hasnext() method
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){

            //  Moving cursor to next element
            int i = itr.next();
            System.out.print(itr.next() + " ");

            if (i % 2 != 0)
                itr.remove();
            System.out.print(itr.next() + " ");
        }
    }
}

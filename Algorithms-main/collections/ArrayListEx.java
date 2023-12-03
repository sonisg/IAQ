package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

    public static void main(String args[])
    {
        // Creating an object of List interface,
        // implemented by ArrayList class
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        // Custom elements
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        // Print all the elements inside the
        // List interface object
        System.out.println(al);

        //updating
        al.set(1, "for");
        System.out.println(al);

        int i = al.indexOf("Geeks");
        System.out.println(i);

        int las = al.lastIndexOf("Geeks");
        System.out.println(las);

        al.remove(1);
        System.out.println(al);

        boolean isPresent = al.contains("Geeks");

        // Printing the result
        System.out.println("Is Geeks present in the list ?  "
                + isPresent);

        for (String s : al){
            System.out.println(s);
        }
        al.add(1, "For");
        Collections.sort(al);
        System.out.println(al);

    }
}

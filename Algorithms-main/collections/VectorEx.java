package com.company.collections;

import java.util.Vector;

public class VectorEx {

    public static void main(String[] arg)
    {

        // Creating generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        // Adding custom elements
        // using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v2 is " + v2);

        v2.set(1, 4);
        System.out.println("Vector v2 is " + v2);

        v2.remove(2);
        System.out.println("Vector v2 is " + v2);

        for (Integer str : v2)
            System.out.print(str + " ");

    }
}

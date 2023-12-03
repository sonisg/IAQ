package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String args[])
    {
        // Initialization of a HashMap
        Map<Integer, String> hm = new HashMap<Integer, String>();

        // Add elements using put method
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm.put(4, "For");

        // Initial HashMap
        System.out.println("Mappings of HashMap are : " + hm);

        hm.put(4, "Always");
        System.out.println("Mappings of HashMap are : " + hm);

        // remove element with a key
        // using remove method
        hm.remove(4);

        // Final HashMap
        System.out.println("Mappings after removal are : "
                + hm);

        for (Map.Entry< Integer, String> e : hm.entrySet()){
            System.out.println("key "+ e.getKey() + " Entry " + e.getValue());
        }
    }
}

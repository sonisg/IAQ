package com.company.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        hashtable.put("C", 44);

        System.out.println(hashtable);
        // Getting values from the hashtable
        int valueA = hashtable.get("A");

        System.out.println("Value of A: " + valueA);

        // Removing elements from the hashtable
        hashtable.remove("B");

        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        if (hashtable.containsKey("A")) {
            Integer a = hashtable.get("A");
            System.out.println("value for key"
                    + " \"A\" is:- " + a);
        }
    }
}

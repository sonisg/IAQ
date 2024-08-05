package coreconceptsprtc;

import java.util.*;

public class OptionalClass {

    public static void main(String args[]){
        Optional<String> optional1 = Optional.of("String");

        if (optional1.isPresent()) {
            System.out.println("Value of optional1: " + optional1.get());
        } else {
            System.out.println("optional1 is empty");
        }

        Optional<String> optional2 = Optional.ofNullable(null);

        if (optional2.isPresent()) {
            System.out.println("Value of optional1: " + optional2.get());
        } else {
            System.out.println("optional1 is empty");
        }

        System.out.println(optional2.orElse("Hello"));

        List<String> stringList = Arrays.asList("apple", null);
        stringList.add("Apple");
        stringList.add(null);
        stringList.add("Orange");
        stringList.add("Banana");
        stringList.add(null);
        stringList.add("Grapes");

        // Sort the list with nullsFirst() to place null values at the beginning
        Collections.sort(stringList, Comparator.nullsFirst(String::compareTo));

        // Print sorted list
        System.out.println("Sorted List with nulls first:");
        stringList.forEach(System.out::println);
//
//        // Sort the list with nullsLast() to place null values at the end
//        Collections.sort(stringList, Comparator.nullsLast(String::compareTo));

        // Print sorted list
        System.out.println("\nSorted List with nulls last:");
        stringList.forEach(System.out::println);
    }


}

package com.company.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddListsForEach {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);

        // Add corresponding values without using a for loop using List.forEach
//        IntStream.range(0, Math.min(list1.size(), list2.size()))
//                .forEach(i -> list1.set(i, list1.get(i) + list2.get(i)));

        List<Integer> finalList = list1;
        list1 = IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> finalList.get(i) + list2.get(i))
                .collect(Collectors.toList());


        // Print the result
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
    }
}


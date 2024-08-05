package coreconceptsprtc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoStrings {

    public static void main(String args[]) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("a", "a", "c");

        // Count occurrences of each element from list1 in list2
        Map<String, Long> countMap = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the occurrences
        countMap.forEach((key, value) -> {
            long occurrences = list2.stream().filter(element -> element.equals(key)).count();
            System.out.println(key + ": " + occurrences);
        });
    }
}

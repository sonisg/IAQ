package coreconceptsprtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupAnagrams {

    public static void  main(String args[]){
        List<String> s = Arrays.asList("abc","bca", "asd", "dsa");
        List<String> sp = new ArrayList<>();
        for(String ss: s){
            sp.add(sortChars(ss));
        }
//        Map<String, List<String>> groupedAnagrams = sp.stream()
//                .collect(Collectors.groupingBy(
//                        str -> str,                       // Group by the sorted string itself
//                        Collectors.mapping(              // Map original strings to their sorted versions
//                                original -> s.get(sp.indexOf(original)), // Getting original string from 's' based on its index
//                                Collectors.toList()       // Collect as a list
//                        )
//                ));

        Map<String, List<String>> groupedAnagrams = s.stream()
                .collect(Collectors.groupingBy(groupAnagrams::sortChars));

        groupedAnagrams.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
    private static String sortChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

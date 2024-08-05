package coreconceptsprtc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamssss {

    public static void main(String args[]){
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        List<String> capitalizedList = strings.stream()
                .map(x-> x.substring(0,1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());

        capitalizedList.forEach(System.out::println);

        List<Integer> a = Arrays.asList(5,6,3,7,8,3,1,9);
        List<Integer> max = a.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(max);

        List<Integer> min = a.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(min);

        List<Integer> minn = a.stream().distinct().sorted().limit(3).collect(Collectors.toList());
        System.out.println(minn);

        String ss = "heommlllos";

        Map<Character,Long> s = ss.chars().mapToObj(ssp->(char) ssp).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        s.entrySet().stream().filter(p->p.getValue()>1).forEach(entry -> System.out.println(entry.getKey()));
    }

}

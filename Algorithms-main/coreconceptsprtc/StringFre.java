package coreconceptsprtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringFre {

    public static void main(String args[]){
        List<String> s = new ArrayList<>();
        s.add("Riya");
        s.add("piya");

       Map<String, Long> sp = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(sp);

       List<Integer> s1 = Arrays.asList(1,2,3,4);
        List<Integer> s2 = Arrays.asList(1,2,3,4);

        List<Integer> sum = IntStream.range(0, s1.size()).mapToObj(i-> s1.get(i)+s2.get(i)).collect(Collectors.toList());
        System.out.println(sum);


    }
}

package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String args[]) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(6);
        a.add(3);
        a.add(6);

        List<Integer> b = a.stream().filter((Integer aa)-> aa < 3 ).collect(Collectors.toList());
        System.out.println(b);

        List<String> s = Arrays.asList("Hello Java");

        List<String> c = s.stream().map((String aa)-> aa.toLowerCase() ).collect(Collectors.toList());
        System.out.println(c);

        List<List<String>> sp = Arrays.asList(Arrays.asList("Hello Java"), Arrays.asList("Way to go"));
        Stream<String> sps = sp.stream().flatMap((List<String> m) -> m.stream());
        sps.forEach(System.out::println);

        List<Integer> as = a.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(as);

        List<Integer> ap = a.stream().filter((Integer val)-> val>2).peek((Integer val)->System.out.println(val)).collect(Collectors.toList());

        List<Integer> li = a.stream().limit(3).collect(Collectors.toList());
        System.out.println(li);


    }

}

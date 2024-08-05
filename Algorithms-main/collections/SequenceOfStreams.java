package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SequenceOfStreams {


    public static void main(String args[]) {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(6);
        a.add(3);

        List<Integer> res = a.stream().filter((ab)->ab>2)
                .peek(s->System.out.println("After filter " + s))
                .map(s->s*2)
                .peek(s->System.out.println("After map " + s))
                .sorted()
                .peek(s->System.out.println("After sort " + s))
                .collect(Collectors.toList());

        System.out.println(res);
    }


}

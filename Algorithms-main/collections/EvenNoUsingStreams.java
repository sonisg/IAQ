package collections;

import java.util.Arrays;
import java.util.List;

public class EvenNoUsingStreams {
    public static void main(String[] args){
        int[] a = {2,2,4,5,6,7,7};
        int sum = Arrays.stream(a).filter(n -> n%2==0).sum();
        System.out.println(sum);

        List<String> s = Arrays.asList("apple", "carrot", "bana", "apple");
        int c = (int) s.stream().filter(w->w.equals("apple")).count();
        System.out.println(c);
    }
}

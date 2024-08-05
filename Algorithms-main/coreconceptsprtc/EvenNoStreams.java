package coreconceptsprtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EvenNoStreams {
    public static void main(String args[]){
        List<Integer> evenNo = Arrays.asList(1,2,3,4,5,44,23,4,45,6);

        Integer res = evenNo.stream().filter(integer -> integer%2==0).mapToInt(Integer::intValue).sum();

        Double avres = evenNo.stream().filter(integer -> integer%2==0).mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println(res);
        System.out.println(avres);

    }
}

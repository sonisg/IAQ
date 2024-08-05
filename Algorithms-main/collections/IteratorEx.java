package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String args[]) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(6);
        a.add(3);
        a.add(6);

        Iterator<Integer> i = a.iterator();
        while(i.hasNext()){
            Integer e = i.next();
            if(e>3) {
                i.remove();
            }
        }
        System.out.println("Modified ArrayList: " + a);


    }
}

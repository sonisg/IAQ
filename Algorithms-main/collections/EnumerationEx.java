package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

    public static void main(String args[]) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);

        Enumeration<Integer> e= v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

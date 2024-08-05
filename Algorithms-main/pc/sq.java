package pc;

import java.util.ArrayList;
import java.util.Collections;

public class sq {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        ArrayList<Double> a = new ArrayList<>();
        a.add(dis(p1,p2));
        a.add(dis(p1,p3));
        a.add(dis(p1,p4));
        a.add(dis(p2,p3));
        a.add(dis(p2,p4));
        a.add(dis(p3,p4));
        Collections.sort(a);
        System.out.println(a);
        if(a.get(0).equals(a.get(3)) && a.get(4).equals(a.get(5))){
            System.out.println("true");
            return true;

        }else{
            System.out.println("false");
            return false;
        }

    }
    public static double dis(int[] p, int[] q){
        double x = Math.sqrt(Math.pow((p[0]-q[0]),2)+Math.pow((p[1]-q[1]),2));
        System.out.println(x);
        return x;
    }

    public static void main(String args[]){
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        validSquare(p1,p2,p3,p4);
    }
}

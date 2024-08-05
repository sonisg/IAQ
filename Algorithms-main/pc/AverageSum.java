package pc;

import java.util.*;

public class AverageSum {

    public static void main (String args[]){
        String[][] scores = {
                {"Bobby", "87"},
                {"Charles", "100"},
                {"Eric", "64"},
                {"Charles", "22"}
        };
        HashMap<String,List<Integer>> h = new HashMap<>();
       for(String[] s: scores){
           String name = s[0];
           Integer val = Integer.parseInt(s[1]);
           if(!h.containsKey(name)){
               h.put(name, new ArrayList<>());
           }
           h.get(name).add(val);
       }

       double bestAverage = Double.MIN_VALUE;
       String stud = "";

       for(Map.Entry<String,List<Integer>> e: h.entrySet()){
           String st = e.getKey();
           List<Integer> val = e.getValue();
           int sum=0;
           for(int a: val){
               sum = sum + a;
           }
           double avg = sum/val.size();

           if(avg > bestAverage){
               bestAverage = avg;
               stud = st;
           }
       }

       System.out.println(bestAverage);
        System.out.println(stud);


    }
}

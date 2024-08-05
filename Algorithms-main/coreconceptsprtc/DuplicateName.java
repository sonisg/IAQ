package coreconceptsprtc;

import javax.naming.ldap.HasControls;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateName {

    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Soniya", 24),
                new Employee("Shivam", 34)
        );
        List<String> s = employeeList.stream().map(e->e.getName()).collect(Collectors.toList());
        Set<String> j = new HashSet<>();
        List<String> u = s.stream().filter(name-> !j.add(name)).collect(Collectors.toList());
        for(String sp: u){
            System.out.println(sp);
        }
        System.out.println("Unique");
        for(String sp: j){
            System.out.println(sp);
        }
        Map<String, Long> m = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> spp = m.entrySet().stream().filter(e-> e.getValue() > 1).map(e->e.getKey()).collect(Collectors.toSet());
        for(Map.Entry<String, Long> e : m.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String sp: spp){
            System.out.println(sp);
        }

        Set<String> dup = s.stream().filter(n -> Collections.frequency(s, n) > 1).collect(Collectors.toSet());
        for(String sp: dup){
            System.out.println(sp);
        }
        String sp = "This is is name name";
        String [] ss = sp.split("/");
        Map<String, Long> mp = Arrays.stream(ss).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       // mp.entrySet().stream().forEach((w,ii)->System.out.println(w + " " + i));
    }
}

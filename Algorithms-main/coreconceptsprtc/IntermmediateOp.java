package coreconceptsprtc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermmediateOp {
    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Soniya", 24),
                new Employee("Shivam", 34)
        );
        List<String> s = employeeList.stream().filter(e-> e.getAge() >30).peek(e->System.out.println(e.getAge())).map(e -> e.getName()).collect(Collectors.toList());
        //s.stream().forEach(s1->System.out.println(s1));
        List<Integer> aa = Arrays.asList(1,2,4,3,2);
        System.out.println(aa.stream().reduce((a,b) -> a+b).get());
    }

}

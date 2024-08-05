package coreconceptsprtc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByStreams {
    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Soniya", 24),
                new Employee("Shivam", 24),
                new Employee("Shivam", 24),
                new Employee("Anamika", 54)
        );
        //group by age
        Map<Integer, List<Employee>> m = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        for (Map.Entry<Integer, List<Employee>> e : m.entrySet()) {
            System.out.println(e.getKey());
            for (Employee emp : e.getValue()) {
                System.out.println(emp.getName());
            }
       }

        Map<Integer, Set<Employee>> mm = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toSet()));
        for (Map.Entry<Integer, Set<Employee>> e : mm.entrySet()) {
            System.out.println(e.getKey());
            for (Employee emp : e.getValue()) {
                System.out.println(emp.getName());
            }
        }

        Set<String> seenNames = new HashSet<>();
        List<Employee> uniqueEmployees = employeeList.stream()
                .filter(e -> seenNames.add(e.getName())).collect(Collectors.toList());

        // Print unique employees
        uniqueEmployees.forEach(System.out::println);

        List<Employee> s = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(s);
    }
}

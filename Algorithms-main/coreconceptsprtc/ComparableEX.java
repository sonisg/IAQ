package coreconceptsprtc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEX {

    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Shon", 24),
                new Employee("vinod", 34)
        );
        Collections.sort(employeeList);
        for(Employee e: employeeList){
            System.out.println(e.getName() + " " + e.getAge());
        }
    }
}

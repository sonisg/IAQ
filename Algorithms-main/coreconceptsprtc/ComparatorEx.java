package coreconceptsprtc;

import coreconceptsprtc.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEx {

    public static void main(String args[]) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Suhana", 24),
                new Employee("Vinod", 34)
        );
        employeeList.sort(Comparator.comparing(Employee::getName));
        for(Employee e: employeeList){
            System.out.println(e.getName() + " " + e.getAge());
        }
    }
}

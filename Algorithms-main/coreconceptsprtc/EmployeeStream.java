package coreconceptsprtc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String args[]){
        List<Employee> employeeList = Arrays.asList(
                new Employee("Shivam", 54),
                new Employee("Shon", 24),
                new Employee("vinod", 34)
                );
        List<String> emp = employeeList.stream().filter(e->e.getAge() > 30).map(Employee::getName).collect(Collectors.toList());

        List<Employee> employeesOver30 = employeeList.stream().filter(e->e.getAge() > 30).collect(Collectors.toList());

        System.out.println(emp);
        System.out.println("Employees over 30: " + employeesOver30);

    }
}

package coreconceptsprtc;

import coreconceptsprtc.Employee;

public class JavaPassByRefernce {

    public static void main (String args[]){
        Employee employee = new Employee("Sam", 22);
        changeAge(employee);
        System.out.println(employee.getAge());
    }

    private static void changeAge(Employee employee) {
        employee.setAge(12);
    }
}

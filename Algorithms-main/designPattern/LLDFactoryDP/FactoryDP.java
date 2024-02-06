package LLDFactoryDP;

public class FactoryDP {

    public static void main(String args[]){
        Employee employee = FactoryEmployee.getEmployee("Web");
        System.out.println(employee);
        employee.salary();
    }
}

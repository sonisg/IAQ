package LLDAbstractFactoryDP;

public class AbstractFactoryDP {

    public static void main(String args[]){
        Employee employee = AbstractEmployee.getEmployee(new AndroidDevFactory());
        employee.salary();
    }
}

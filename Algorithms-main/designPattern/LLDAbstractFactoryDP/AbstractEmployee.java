package LLDAbstractFactoryDP;

public class AbstractEmployee {

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory){
        return employeeAbstractFactory.createEmployee();
    }
}

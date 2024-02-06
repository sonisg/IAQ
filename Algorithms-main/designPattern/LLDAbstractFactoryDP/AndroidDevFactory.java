package LLDAbstractFactoryDP;

public class AndroidDevFactory implements EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}

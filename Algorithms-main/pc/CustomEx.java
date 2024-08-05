package pc;

class CustomException {

    public static void main(String[] args) {
        CustomExceptionDemo customExceptionDemo = new CustomExceptionDemo();
        try{
            customExceptionDemo.validateAge(15);
        } catch (CustomEx e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

public class CustomEx extends RuntimeException{
    public CustomEx(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    // Method that throws the custom exception
    public void validateAge(int age) throws CustomEx {
        if (age < 18) {
            throw new CustomEx("Age must be 18 or above.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}
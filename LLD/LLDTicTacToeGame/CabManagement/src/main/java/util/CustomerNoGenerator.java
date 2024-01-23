package util;

public class CustomerNoGenerator {

    public static int customerNo=1;

    public static int getCustomerNoGenerator(){
        return customerNo++;
    }

}

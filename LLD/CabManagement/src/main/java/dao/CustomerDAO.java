package dao;

import model.Customer;

import java.util.HashMap;

public class CustomerDAO {

    public HashMap<Integer, Customer> customerHashMap = new HashMap<>();

    public CustomerDAO() {
    }

    public HashMap<Integer, Customer> getCustomerHashMap() {
        return customerHashMap;
    }

    public void setCustomerHashMap(HashMap<Integer, Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }

    public CustomerDAO(HashMap<Integer, Customer> customerHashMap) {
        this.customerHashMap = customerHashMap;
    }
}

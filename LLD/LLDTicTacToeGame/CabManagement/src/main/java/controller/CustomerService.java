package controller;

import dao.CustomerDAO;
import model.Customer;

public class CustomerService {

    private CustomerDAO customerDAO = new CustomerDAO();

    public Customer createCustomer(String customer_name, String phone) {
        Customer customer = new Customer(customer_name, phone);
        customerDAO.getCustomerHashMap().put(customer.getCustomer_id(), customer);
        return customer;
    }
}

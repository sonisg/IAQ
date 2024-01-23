package model;

import util.CustomerNoGenerator;

public class Customer {

    private Integer customer_id;

    private String customer_name;

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Customer(String customer_name, String phone_no) {
        this.customer_id = CustomerNoGenerator.getCustomerNoGenerator();
        this.customer_name = customer_name;
        this.phone_no = phone_no;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    private String phone_no;
}

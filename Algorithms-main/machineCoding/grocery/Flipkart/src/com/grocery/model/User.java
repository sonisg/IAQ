package com.grocery.model;

public class User {

    private String name;
    private String address;
    private Integer wallet;

    public User(String name, String address, Integer wallet) {
        this.name = name;
        this.address = address;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getWallet() {
        return wallet;
    }

    public void setWallet(Integer wallet) {
        this.wallet = wallet;
    }
}

package com.grocery.model;

import java.util.List;

public class Cart {

    private User user;

    private String brand;

    private String category;

    private Integer units;

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    private Integer totalPrice;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Cart(User user, String brand, String category, Integer units) {
        this.user = user;
        this.brand = brand;
        this.category = category;
        this.units = units;
    }


}

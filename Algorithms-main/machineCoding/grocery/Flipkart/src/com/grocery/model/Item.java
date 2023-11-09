package com.grocery.model;

public class Item {

    private String Brand;

    private String Category;

    private Integer price;

    public Item(String brand, String item, Integer price) {
        Brand = brand;
        Category = item;
        this.price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}

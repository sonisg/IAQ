package com.grocery.model;

public class Inventory {

    private Item item;

    private Integer units;

    public Inventory(Item item, Integer units) {
        this.item = item;
        this.units = units;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}

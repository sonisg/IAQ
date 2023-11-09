package com.grocery.dao;

import com.grocery.model.Item;

import java.util.HashMap;

public class ItemDao {

    public HashMap<String, Item> itemHashMap;

    public ItemDao() {
        this.itemHashMap = new HashMap<>();
    }

    public HashMap<String, Item> getItemHashMap() {
        return itemHashMap;
    }

    public void setItemHashMap(HashMap<String, Item> itemHashMap) {
        this.itemHashMap = itemHashMap;
    }
}

package com.grocery.dao;

import com.grocery.model.Inventory;

import java.util.HashMap;

public class InventoryDao {

    public HashMap<String, Inventory> inventoryHashMap;

    public InventoryDao() {
        this.inventoryHashMap = new HashMap<>();
    }

    public HashMap<String, Inventory> getInventoryHashMap() {
        return inventoryHashMap;
    }

    public void setInventoryHashMap(HashMap<String, Inventory> inventoryHashMap) {
        this.inventoryHashMap = inventoryHashMap;
    }
}

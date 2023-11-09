package com.grocery.dao;

import com.grocery.model.Cart;

import java.util.HashMap;

public class CartDao {

    public HashMap<String, Cart> cartHashMap;

    public CartDao() {
        this.cartHashMap = new HashMap<>();
    }

    public HashMap<String, Cart> getCartHashMap() {
        return cartHashMap;
    }

    public void setCartHashMap(HashMap<String, Cart> cartHashMap) {
        this.cartHashMap = cartHashMap;
    }
}

package com.grocery.dao;

import com.grocery.model.User;

import java.util.HashMap;

public class UserDao {

    public HashMap<String, User> userHashMap;

    public UserDao() {
        this.userHashMap = new HashMap<>();
    }

    public HashMap<String, User> getUserHashMap() {
        return userHashMap;
    }

    public void setUserHashMap(HashMap<String, User> userHashMap) {
        this.userHashMap = userHashMap;
    }
}

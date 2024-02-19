package dao;

import model.User;

import java.util.HashMap;
import java.util.List;

public class UserDao {

    HashMap<Integer, User> userList ;

    public UserDao(){
        userList = new HashMap<>();
    }

    public HashMap<Integer, User> getUserList() {
        return userList;
    }

    public void setUserList(HashMap<Integer, User> userList) {
        this.userList = userList;
    }
}

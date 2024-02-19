package service;

import dao.UserDao;
import model.User;

public class UserService {

    UserDao userDao = new UserDao();

    public User addUser(User user){
        userDao.getUserList().put(user.getUser_id(),user);
        System.out.println("User added successfully. User Name: " + user.getName());
        return user;
    }
}

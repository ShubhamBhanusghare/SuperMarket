package com.supermarket.dao;

import com.supermarket.model.Admin;
import com.supermarket.model.Cashier;
import com.supermarket.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    public static final Map<String, User> users = new HashMap<>();

    static{
        users.put("admin1", new Admin("admin1", "Shubham", "adminpass"));
        users.put("cashier1", new Cashier("cashier1", "Priya", "cashierpass"));
    }

    public User getUserByName(String userName){
        if(userName == null){
            return null;
        }
        return users.get(userName);
    }

    public void addUser(User user){
        if (user != null && !users.containsKey(user.getUserName())) {
            users.put(user.getUserName(), user);
        }
    }

    public void deleteUser(String userName){
        if (userName != null) {
            users.remove(userName);
        }
    }

    public Collection<User> getAllUsers(){
        return users.values();
    }

}

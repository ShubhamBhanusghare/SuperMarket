package com.supermarket.repository;

import com.supermarket.model.Admin;
import com.supermarket.model.Cashier;
import com.supermarket.model.Roles;
import com.supermarket.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> userMap=new HashMap<>();
    static {
        userMap.put("Ram",new Admin("1","Ram","1111"));
        userMap.put("Krishna", new Cashier("2","Krishna","0000"));
    }
    public User findByUsername(String username)
    {
        return userMap.get(username);
    }

    public void addUser(User user){
        if (user != null && !userMap.containsKey(user.getUserName())) {
            userMap.put(user.getUserName(), user);
        }
    }

    public void deleteUser(String userName){
        if (userName != null) {
            userMap.remove(userName);
        }
    }

    public Collection<User> getAlluserMap(){
        return userMap.values();
    }

}

package com.supermarket.repository;

import com.supermarket.model.Admin;
import com.supermarket.model.Cashier;
import com.supermarket.model.Roles;
import com.supermarket.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static final Map<String, User> userMap=new HashMap<>();
    static {
        userMap.put("Ram",new Admin("1","Ram","1111", Roles.ADMIN));
        userMap.put("Krishna", new Cashier("2","Krishna","0000",Roles.CASHIER));
    }
    public User findByUsername(String username)
    {
        return userMap.get(username);
    }

}

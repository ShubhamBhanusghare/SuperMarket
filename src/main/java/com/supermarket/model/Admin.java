package com.supermarket.model;

import com.supermarket.constants.Roles;

public class Admin extends User{

    public Admin(String userId, String userName, String password) {
        super(userId, userName, password, Roles.ADMIN);
    }
}

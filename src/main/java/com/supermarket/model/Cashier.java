package com.supermarket.model;

import com.supermarket.constants.Roles;

public class Cashier extends User{

    public Cashier(String userId, String userName, String password) {
        super(userId, userName, password, Roles.CASHIER);
    }

}

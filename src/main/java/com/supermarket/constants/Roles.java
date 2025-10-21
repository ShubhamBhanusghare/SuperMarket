package com.supermarket.constants;

public enum Roles {
    CASHIER, ADMIN;

    public static Roles fromString(String role){
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null");
        }
        for (Roles r: Roles.values()){
                if (r.name().equalsIgnoreCase(role)){
                    return r;
                }else {
                    throw new IllegalArgumentException("Invalid Role: " +role);
                }
        }
        return null;
    }
    //Can we update this enum with description?
}

package com.supermarket.controller;

import com.supermarket.model.User;

public class SessionController {
    private static User currentUser;
    public static void setCurrentUser(User user) {
        currentUser = user;
    }
    public static User getCurrentUser() {
        return currentUser;
    }
    public static void clearSession() {
        currentUser = null;
    }
    public static boolean isLoggedIn() {
        return currentUser != null;
    }
}

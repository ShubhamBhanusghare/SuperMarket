package com.supermarket.service;

import com.supermarket.controller.SessionController;

public class LogoutService {
    public void logout() {
        if (SessionController.isLoggedIn()) {
            System.out.println("-------------------------------------");
            System.out.println("Logging out...");
            System.out.println("You have been logged out successfully!");
            System.out.println("-------------------------------------");

            SessionController.clearSession();
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
}

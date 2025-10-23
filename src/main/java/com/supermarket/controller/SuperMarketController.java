package com.supermarket.controller;

import com.supermarket.model.User;
import com.supermarket.service.LoginService;
import com.supermarket.service.MenuService;

import java.util.Scanner;

public class SuperMarketController {
    private final LoginService loginService = new LoginService();
    MenuService menuservice=new MenuService();
    private final Scanner scanner = new Scanner(System.in);
    public void start() {
        while(true) {
            showMainMenu();
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: handleLogin(); break;
                case 2: System.exit(1); return;
                default: System.out.println("Invalid choice...");
            }
        }
    }

    private void handleLogin() {
        System.out.println("""
                -------------------------------------
                User Login
                -------------------------------------""");
        System.out.println("Enter Username");
        String username=scanner.next();
        System.out.println("Enter Password");
        String password=scanner.next();
        User validatedUser=loginService.validateUser(username,password);
        if(validatedUser==null){
            System.out.println("Invalid username or password. Try again...");
        }
        else{
            System.out.println("Login successful!");
            System.out.println("Welcome!!! "+ validatedUser.getUserName() +" Role: "+validatedUser.getRole());
            SessionController.setCurrentUser(validatedUser);
            menuservice.showMenu();
        }
    }

    private void showMainMenu(){
        System.out.println("""
                =====================================
                Welcome to Our Supermarket
                =====================================
                
                1. Login
                2. Exit
                """);
        System.out.println("Enter your choice:");
    }


}

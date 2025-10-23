package com.supermarket.service;

import com.supermarket.controller.AdminController;
import com.supermarket.controller.CashierController;
import com.supermarket.controller.SessionController;
import com.supermarket.model.Roles;

import java.util.Scanner;

public class MenuService {

    AdminController adminController=new AdminController();
    CashierController cashierController=new CashierController();
    Scanner sc = new Scanner(System.in);
    LogoutService logoutService=new LogoutService();


    public void showMenu() {
        boolean isLoggedIn=true;
        while(isLoggedIn) {
            if (SessionController.getCurrentUser()
                    .getRole().equals(Roles.ADMIN)) {

                System.out.println("""
                        -------------------------------------
                        Admin Menu
                        -------------------------------------
                        1. Add Product
                        2. Add User
                        3. Delete User
                        4. Generate Report
                        5. Logout
                        
                        Enter your choice:""");
                int choice = sc.nextInt();
                if (choice == 5) {
                    logoutService.logout();
                    isLoggedIn = false;
                } else
                    adminController.performAction(choice);
            } else if (SessionController.getCurrentUser().getRole().equals(Roles.CASHIER)) {
                System.out.println("""
                        -------------------------------------
                        Cashier Menu
                        -------------------------------------
                        1. Scan Product
                        2. Generate Bill
                        3. View Stock
                        4. Logout
                        
                        Enter your choice:""");
                int choice = sc.nextInt();
                if (choice == 4) {
                    logoutService.logout();
                    isLoggedIn = false;
                } else cashierController.performAction(choice);

            }
        }
    }
}

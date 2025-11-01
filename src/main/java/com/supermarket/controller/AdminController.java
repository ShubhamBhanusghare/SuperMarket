package com.supermarket.controller;

import com.supermarket.service.AdminService;

public class AdminController {
    /*
    In this Controller, once you create the adminService, you never assign a new object to it.

The compiler or IDE (like IntelliJ) sees this and suggests: “Hey, you can make this final because it’s never reassigned.”

Ensures immutability of the reference

final guarantees that adminService will always point to the same object after initialization.

This prevents accidental reassignment later in the code.
     */
    private final AdminService adminService=new AdminService();

    public void performAction(int choice){
        switch (choice)
        {
            case 1:
                adminService.addProduct();
                break;
            case 2:
                adminService.viewInventory();
                break;
            case 3:
                adminService.updateProduct();
                break;
            case 4:
                adminService.deleteProduct();
                break;
            case 5:
                adminService.addUser();
                break;
            case 6:
                adminService.getAllUsers();
                break;
            case 7:
                adminService.deleteUser();
                break;

            default: System.err.println("\nInvalid choice.\n");
        }
    }


}

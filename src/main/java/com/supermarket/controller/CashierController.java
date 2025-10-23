package com.supermarket.controller;

import com.supermarket.service.CashierService;

public class CashierController {
    private final CashierService cashierService=new CashierService();
    public void performAction(int choice){
        switch (choice)
        {
            case 1:
                cashierService.scanProduct();
                break;
            case 2:
                cashierService.generateBill();
                break;
            case 3:
                cashierService.viewProduct();
                break;
            default: System.err.println("\nInvalid choice.\n");
        }
    }


}

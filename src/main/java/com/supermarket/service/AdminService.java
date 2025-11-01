package com.supermarket.service;

import com.supermarket.model.Product;
import com.supermarket.model.Roles;
import com.supermarket.model.User;
import com.supermarket.repository.ProductRepository;
import com.supermarket.repository.UserRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class AdminService {

    private final UserRepository userRepository=new UserRepository();
    private final ProductService productService = new ProductService(new ProductRepository());
    private final Scanner sc = new Scanner(System.in);

    public void addProduct(){
        System.out.println("Enter Product Name:");
        String name = sc.next();
        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();
        productService.addProduct(name,price,qty);
        System.out.println("Added Product!!");
    }
    public void viewInventory() {
        System.out.println("\n========= INVENTORY LIST =========");
        List<Product> allProducts = productService.getAllProducts();
        allProducts.forEach(System.out::println);
    }
    public void updateProduct(){
        System.out.println("Enter Product ID to update:");
        String id = sc.next();
        System.out.println("Enter new price:");
        double newPrice = sc.nextDouble();
        System.out.println("Enter stock to add:");
        int stock = sc.nextInt();
        productService.updateProduct(id,newPrice,stock);

    }
    public void deleteProduct(){
        System.out.println("Enter Product ID to delete:");
        String id = sc.next();
        productService.deleteProduct(id);
    }
    public void addUser(){
        while (true) {
            System.out.println("Enter Username:");
            String username = sc.next();
            if(userRepository.isUserExists(username)) {
                System.out.println("User name already exists");
            }
            else{
                System.out.println("Enter Password:");
                String password=sc.next();
                System.out.println("Role of User: 1.CASHIER 2.ADMIN");
                int num=sc.nextInt();
                if(num==1)
                    userRepository.addUser(new User("1",username,password, Roles.CASHIER));
                else if(num==2)
                    userRepository.addUser(new User("2",username,password,Roles.ADMIN));
                break;
            }
        }

    }
    public void deleteUser(){
        System.out.println("Enter Username:");
        String username = sc.next();
        userRepository.deleteUser(username);
    }
    public void getAllUsers(){
        System.out.println(userRepository.getAllUsers());
    }
    public void generateReport(){
    // dummy
        System.out.println("Generated Report!!");
    }

}

package org.electronics;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Product> shoppingHistory;
    private double totalAmount;

    public Customer(String name){
        this.name = name;
        shoppingHistory = new ArrayList<>();
        totalAmount = 0.0;
    }

    public String getName() {
        return name;
    }

    public List<Product> getShoppingHistory() {
        return shoppingHistory;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addProductToHistory(Product product){
        shoppingHistory.add(product);
        totalAmount += product.getDiscountedPrice();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", shoppingHistory=" + shoppingHistory +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

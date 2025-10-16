package org.electronicsgoods;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Product> productList;
    private Double totalAmount;

    public Customer(String customerName) {
        this.customerName = customerName;
        productList = new ArrayList<>();
        totalAmount = 0.0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }
}

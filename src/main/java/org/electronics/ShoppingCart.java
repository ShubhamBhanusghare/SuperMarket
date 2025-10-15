package org.electronics;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateTotal(){
        double total = 0.0;
        for(Product product: products){
            total += product.getDiscountedPrice();
        }
        return total;
    }

    public void showCart(){
        System.out.println("Shopping Cart: ");
        for (Product product: products){
            System.out.println(product);
        }
    }
}

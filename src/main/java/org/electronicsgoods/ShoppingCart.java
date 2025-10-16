package org.electronicsgoods;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateBill(){
        double totalAmmount = 0.0;
        for (Product product: products){
         totalAmmount = totalAmmount+product.getDiscountedPrice();
        }
        return totalAmmount;
    }

    public void showCart(){
        for(Product product: products){
            System.out.println("\nProduct: " +product);
        }
    }

    public double getTotalCartValue(){
        double total = 0.0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    public double getDiscountAmount(){
        double discountAmount = 0.0;
        for(Product product: products){
            discountAmount += (product.getPrice()*product.getDiscount()/100);
        }
        return discountAmount;
    }


}

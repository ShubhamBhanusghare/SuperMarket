package org.grocery;

import java.util.ArrayList;

public class GroceryProduct {

    String name;
    double price;
    double discount;

    public double totalPrice(){
        double total = 0;
        total = total+(price - (price*discount/100));
        return total;
    }

    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static void main(String[] args) {
        ArrayList<GroceryProduct> cart = new ArrayList<>();

        GroceryProduct toast = new GroceryProduct("Toast", 1.5, 10);
        cart.add(toast);

        DairyProduct milk = new DairyProduct("Milk", 4, 0, Fat.SKIMMED);
        cart.add(milk);

        Beverages coke = new Beverages("Coke", 2, 0, SugarLevel.ADDED_SUGAR);
        cart.add(coke);

        for (int i = 0; i<cart.size(); i++){
            System.out.println(cart.get(i).totalPrice());
        }
    }
}

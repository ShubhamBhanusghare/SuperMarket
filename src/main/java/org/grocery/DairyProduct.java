package org.grocery;

public class DairyProduct extends GroceryProduct{

    private Fat fat;

    public DairyProduct(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }
}

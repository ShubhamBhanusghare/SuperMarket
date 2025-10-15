package org.grocery;

public class Beverages extends GroceryProduct{

    private SugarLevel sugarLevel;

    public Beverages(String name, double price, double discount, SugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;
    }
}

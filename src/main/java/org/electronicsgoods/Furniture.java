package org.electronicsgoods;

public class Furniture extends Product{

    private String materialType;

    public Furniture(String name, double price, double discount, String materialType) {
        super(name, price, discount);
        this.materialType = materialType;
    }
}

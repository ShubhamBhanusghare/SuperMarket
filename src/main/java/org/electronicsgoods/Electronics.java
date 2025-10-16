package org.electronicsgoods;

public class Electronics extends Product{

    private String warranty;

    public Electronics(String name, double price, double discount, String warranty) {
        super(name, price, discount);
        this.warranty = warranty;
    }

}

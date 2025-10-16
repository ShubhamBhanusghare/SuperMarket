package org.electronicsgoods;

public class Product {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount){
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
        if (price < 0){
            throw new IllegalArgumentException("Price can not be negative.");
        }
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //How do we decide method parameters
    public double getDiscountedPrice(){
        double discountedPrice = price - (price*discount/100);
        return discountedPrice;
    }

    //why do we override toString()
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

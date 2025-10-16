package org.electronicsgoods;

public class SuperMarketApp {
    public static void main(String[] args) {

        Product mobile = new Electronics("Samsung M51", 23000, 5.5, "2 years");
        Product sofa = new Furniture("Sofa", 29000, 10, "centuryPly");
        Product television = new Electronics("Samsung Led", 22000, 6, "1 year");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(mobile);
        cart.addProduct(sofa);
        cart.addProduct(television);

        Customer customer = new Customer("Shubham");

        cart.showCart();

        double totalCartValue = cart.getTotalCartValue();
        System.out.println("\nTotal cart amount:" +totalCartValue);

        double discountAmount = cart.getDiscountAmount();
        System.out.println("\nTotal Discount: "+discountAmount);

        System.out.println("\nYou Saved: " +discountAmount+ " on your total:" +totalCartValue);

        double bill = cart.calculateBill();
        System.out.println("\nfinal Cart Bill: " + bill);
    }
}

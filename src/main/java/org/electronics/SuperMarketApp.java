package org.electronics;

public class SuperMarketApp {

    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 30000.0, 15, "2 years");
        Product sofa = new Furniture("Sofa", 18000, 10, "leather");
        Product mobile = new Electronics("Smartphone", 12000, 5, "1 year");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(sofa);
        cart.addProduct(mobile);

        Customer customer = new Customer("Shubham");
        customer.addProductToHistory(laptop);
        customer.addProductToHistory(sofa);
        customer.addProductToHistory(mobile);

        customer.getShoppingHistory();

        cart.showCart();
        double total = cart.calculateTotal();
        System.out.println("\nTotal cart value: "+ total);

        System.out.println("\nTotal spent by " + customer.getName() + " " + customer.getTotalAmount());

    }
}

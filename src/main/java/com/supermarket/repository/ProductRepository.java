package com.supermarket.repository;

import com.supermarket.model.Product;

import java.util.*;

public class ProductRepository {

    private static final Map<String, Product> products = new HashMap<>();

    public void save(Product product){
        products.put(product.getProductId(), product);
    }

    public Optional<Product> getProductById(String productId){
        return Optional.ofNullable(products.get(productId));
    }

    public List<Product> searchByName(String productName){
        return products.values().stream()
                .filter(p->p.getProductName().equalsIgnoreCase(productName)).toList();
    }

    public Optional<Product> deleteProduct(String productId){
        return Optional.ofNullable(products.remove(productId));
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(products.values());
    }

    public boolean existByName(String name){
        return products.values().stream()
                .anyMatch(p->p.getProductName().equalsIgnoreCase(name));
    }


}

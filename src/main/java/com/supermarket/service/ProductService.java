package com.supermarket.service;

import com.supermarket.model.Product;
import com.supermarket.repository.ProductRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static com.supermarket.utils.IdGenerator.generateProductId;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void addProduct(String name, double price, int quantity){
        if (productRepository.existByName(name)){
            throw new IllegalArgumentException("Product with name: "+name+ " already exist");
        }
        String productId = generateProductId();
        Product product = new Product(productId, name, price, quantity);
        productRepository.save(product);
        System.out.println("\nProduct Added succesfully! Id" + product.getProductId());
    }

    public void updateProduct(String productId, double newPrice, int newQuantity){
        Product product = getProductById(productId)
                .orElseThrow(()->new NoSuchElementException("Product not found"));

        product.setProductPrice(newPrice);
        product.setProductQuantity(newQuantity);
        productRepository.save(product);
        System.out.println("Product has been updated!");
    }

    public Optional<Product> deleteProduct(String productId){

        return productRepository.deleteProduct(productId);
    }

    public Optional<Product> getProductById(String productId){
        return productRepository.getProductById(productId);
    }

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }

    public List<Product> searchProducts(String name){
        return productRepository.searchByName(name);
    }

}

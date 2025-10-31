package com.supermarket.controller;

import com.supermarket.repository.ProductRepository;
import com.supermarket.service.ProductService;

public class ProductController {

    ProductRepository productRepository = new ProductRepository();
    ProductService productService = new ProductService(productRepository);

}

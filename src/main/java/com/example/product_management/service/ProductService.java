package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Laptop Dell", 15000000));
        products.add(new Product(2L, "Chuột Logitech", 350000));
        products.add(new Product(3L, "Bàn phím cơ", 1200000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

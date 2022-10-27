package com.example.crud_api.service;

import com.example.crud_api.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product addProduct(Product product);
    boolean sellProduct(int id,int quantity);
}

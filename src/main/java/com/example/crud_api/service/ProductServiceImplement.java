package com.example.crud_api.service;

import com.example.crud_api.entity.Product;
import com.example.crud_api.repository.RepoProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImplement implements ProductService{
    @Autowired
    RepoProduct repoProduct;
    @Override
    public List<Product> getAllProduct() {
        return repoProduct.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return repoProduct.save(product);
    }

    @Override
    public boolean sellProduct(int id, int quantity) {
        Product product = repoProduct.findById(id).orElse(null);
        if (product != null){
            int quantityNew = product.getQuantity() - quantity;
            product.setQuantity(quantityNew);
            repoProduct.save(product);
            return true;
        }
        return false;
    }
}

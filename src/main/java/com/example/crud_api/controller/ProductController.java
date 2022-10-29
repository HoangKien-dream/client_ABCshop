package com.example.crud_api.controller;

import com.example.crud_api.entity.Product;
import com.example.crud_api.service.ProductServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {
    @Autowired
    ProductServiceImplement productServiceImplement;
    @RequestMapping(path = "getList",method = RequestMethod.GET)
    public List<Product> getAll(){
        return productServiceImplement.getAllProduct();
    }
    @RequestMapping(path = "create",method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return  productServiceImplement.addProduct(product);
    }
    @RequestMapping(path = "sell",method = RequestMethod.POST)
    public boolean sellProduct(@RequestParam int id,@RequestParam int quantity){
        return productServiceImplement.sellProduct(id,quantity);
    }
}

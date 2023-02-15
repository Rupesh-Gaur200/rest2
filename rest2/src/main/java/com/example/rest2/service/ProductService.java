package com.example.rest2.service;

import java.util.List;

import com.example.rest2.entity.Product;

public interface ProductService {
   public List<Product> getproduct();
   public Product getproduct(String productId);
   public Product addproduct();
   public Product updateproduct(Product product);
   public Product getproduct(long productId);
  
}

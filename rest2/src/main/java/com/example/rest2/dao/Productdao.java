package com.example.rest2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest2.entity.Product;

public interface Productdao extends JpaRepository<Product,Long>{

}

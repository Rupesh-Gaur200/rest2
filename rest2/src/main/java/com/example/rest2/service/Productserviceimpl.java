package com.example.rest2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest2.dao.Productdao;
import com.example.rest2.entity.Product;
@Service
public class Productserviceimpl implements ProductService{
	
	
	@Autowired
	private Productdao productdao;
	@Override
	public List<Product> getproduct() {
		return productdao.findAll();
		}

	@SuppressWarnings("deprecation")
	@Override
	public Product getproduct(long productId) {
		
		return productdao.getOne(productId);
	}

	@Override
	public Product getproduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addproduct() {
		
		return productdao.save(null);
	}

	@Override
	public Product updateproduct() {
		return productdao.save(null);
	}

}

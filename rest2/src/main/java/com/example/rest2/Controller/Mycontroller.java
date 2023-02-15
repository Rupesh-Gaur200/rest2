package com.example.rest2.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest2.entity.Product;
import com.example.rest2.service.ProductService;


@RestController
public class Mycontroller {
	
	private ProductService productservice;
	
	
	//show all the product
	@GetMapping("/product")
      public List<Product> getproduct() {
		return this.productservice.getproduct();
	}
	 //show the product with id 
	 @GetMapping("/product/{productId}")
	 public Product getproduct(@PathVariable String productid){
		return this.productservice.getproduct(productid);
	 }
      // Add the product
      @PostMapping(path="/add")
      public Product addproduct(@RequestBody Product product) {
		return this.productservice.addproduct();
      }
      
      //Update the Product Description
      @PutMapping(path="/update")
      public Product updateproduct(@RequestBody Product product) {
    	  return this.productservice.updateproduct(product);
      }
	
      
      @DeleteMapping(path="/delProduct")
      public Product deleteproduct() {
    	  return this.productservice.deleteproduct()
      }




}
 

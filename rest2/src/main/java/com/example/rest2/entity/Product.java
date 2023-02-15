package com.example.rest2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
        @Id
		private long productid;
        private String productname;
        private String productdescription;
        
        
        
        
        public Product(long productid, String productname, String productdescription) {
    		super();
    		this.productid = productid;
    		this.productname = productname;
    		this.productdescription = productdescription;
    	}
        
        
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "Product [productid=" + productid + ", productname=" + productname + ", productdescription="
					+ productdescription + "]";
		}


		public long getProductid() {
			return productid;
		}
		public void setProductid(long productid) {
			this.productid = productid;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public String getProductdescription() {
			return productdescription;
		}
		public void setProductdescription(String productdescription) {
			this.productdescription = productdescription;
		}
        
}

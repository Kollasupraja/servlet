package com.trainingassis.service;

import java.util.List;

import com.trainingassis.model.Product;

public interface ProductService {
	
	boolean isValidProduct(int productid, String productdesc,String productname,int price);
	List<Product>getProduct();
	boolean isValidproduct();

}

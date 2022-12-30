package com.trainingassis.service;

import java.util.List;

import com.trainingassis.dao.Productdao;
import com.trainingassis.dao.ProductdaoImpl;
import com.trainingassis.model.Product;

public class ProductServiceImpl implements ProductService{
	@Override
	public
	boolean isValidProduct(int productid, String productdesc,String productname,int price) {
		Productdao dao = new ProductdaoImpl();
		boolean isValid = false;
		List<Product> productList = dao.getProduct();
		for (Product pro : productList) {
			if (pro.getProductid()==(productid) && pro.getProductdesc().equals(productdesc)&&pro.getProductname().equals(productname)&&pro.getPrice()==(price)) {
				isValid = true;
			}
		}
		return isValid;
	}
	@Override
	public List<Product> getProduct(){
		List<Product> ProductList=dao.getProduct();
		return ProductList;
	}
}

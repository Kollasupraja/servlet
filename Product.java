package com.trainingassis.model;

public class Product {
	private int productid;
	private String productdesc;
	private String productname;
	private int price;
	public Product() {

	}
	public Product(int productid, String productdesc,String productname,int price ) {
		super();
		this.productid = productid;
		this.productdesc = productdesc;
		this.productname=productname;
		this.price=price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	}

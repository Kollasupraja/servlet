package com.trainingassis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.trainingassis.model.Product;

public class ProductdaoImpl implements Productdao{
	
	
	@Override
	public List<Product> getProduct() {

		 List<Product> productList = new ArrayList<>();
		 Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

	        //Scanner sc = new Scanner(System.in);
	        String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "pass123";
	        con = DriverManager.getConnection(url,user,pass);
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from product1");
	        while(rs.next()) {
	          	productList.add(new Product(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4)));

	        }

		 }  
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return productList;
	}
}

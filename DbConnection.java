package com.assignment.jsf.electricbill;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
        {

    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/infinite";
    String user="root";
    String password="Rootadmin@123";
    Connection con=DriverManager.getConnection(url,user,password);
    if(con!=null){
        System.out.println("connection successfull");

 

    }
    else{
        System.out.println("connection unsuccess");
    }
    return con;

 

}
}
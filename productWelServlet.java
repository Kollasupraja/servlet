package com.trainingassignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trainingassis.model.Product;

/**
 * Servlet implementation class productWelServlet
 */
@WebServlet("/productWelServlet")
public class productWelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String product = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productWelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String productid = (String)request.getAttribute("productid");
		String productdesc = (String)request.getAttribute("productdesc");
		String productname = (String)request.getAttribute("productname");
		String price = (String)request.getAttribute("price");
		List<product> productList = (List<Product>)request.getAttribute("productList");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("productList", productList);
		
		Cookie cookie1 = new Cookie(" productid", productid);
		Cookie cookie2 = new Cookie(" productdesc ", productdesc);
		Cookie cookie3 = new Cookie(" productname", productname);
		Cookie cookie4 = new Cookie(" price", price);

		
		
		response.addCookie(cookie1);
		//response.addCookie(cookie2);
		
		
		out.print("<h1>Welcome "+product+"! You are successfully logged in </h1>");
		
		out.println("<table border='1'> ");
		out.println("<tr> <th>");
		out.println("Name </th>");
		out.println("<th> Password </th>");
		for(Product product1:productList) {
			out.println("<tr><td>" +product1.getProductid() +"</td>");
			out.println("<td>" +product1.getProductdesc() +"</td> </tr>");
			out.println("<tr><td>" +product1.getProductname() +"</td>");
			out.println("<tr><td>" +product1.getPrice() +"</td>");
		}
		out.println("<h3> Click on the below link to see username and password</h3><br/>");
		out.println("<a href='GetUrlParamServlet?userName="+productid+"&productdesc="+productdesc+"&productname="+productname+"&price="+price+"'>Click here</a>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

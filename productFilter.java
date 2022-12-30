package com.trainingassignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.trainingassis.service.ProductService;
import com.trainingassis.service.ProductServiceImpl;

/**
 * Servlet Filter implementation class productFilter
 */
@WebFilter("/productWelServlet")
public class productFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public productFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chainresponse.setContentType("text/html");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String productName = request.getParameter("productName");
		String password = request.getParameter("pwd");

		ProductService service = new ProductServiceImpl();

		if(productName.equals("") || password.equals("")) {
			out.print("<h2>**Please enter username and password**<h2>");

			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}

		else if(service.isValidproduct(productName, password)) {
			request.setAttribute("product", productName);
			chain.doFilter(request, response);
		}

		else {
			out.print("<h2>Incorrect login credential!!<h2>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

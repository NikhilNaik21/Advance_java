package com.JDBC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Userinput
 */
//@WebServlet({ "/Userinput", "/Addproduct" })
//@WebServlet({ "/Userinput"})
@WebServlet(urlPatterns = "/Userinput")
public class Userinput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userinput() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		/* PrintWriter write = response.getWriter(); */
		Product prod = new Product();
		prod.setProductId(Integer.parseInt(request.getParameter("ProductId")));
		prod.setProductName(request.getParameter("ProductName"));
		prod.setPrice(Integer.parseInt(request.getParameter("Price")));
		
		ProductBean bean = new ProductBean();
		bean.Addproduct(prod);
		
		RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
		rd.forward(request, response);
	}

}

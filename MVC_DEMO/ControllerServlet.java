package com.day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.ValidationMessage;

import org.apache.el.util.Validation;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter write = response.getWriter();
		
		String uname = request.getParameter("UName");
		String password = request.getParameter("Pwd");
		
		LoginValidation validate = new LoginValidation();
		//validate.checkLogin(uname, password);
//		write.print("<h1> Welcome " + uname+ "<h1>");
		int result = validate.checkLogin(uname, password);
		
		if(result ==1)
		{
			/* response.sendRedirect("Login Success.jsp"); */
			write.print("HELLLLOOOOO");
			System.out.println("All Good...");
			RequestDispatcher rd = request.getRequestDispatcher("Login Success.jsp");
			rd.forward(request, response);
		}
		else 
			{
				/* response.sendRedirect("ErrorPage.jsp"); */
			System.out.println("Login Failed...");
			RequestDispatcher rd = request.getRequestDispatcher("Invalid.jsp");
			rd.forward(request, response);
				
				
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

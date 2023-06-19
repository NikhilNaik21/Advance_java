package com.day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Userinput
 */
@WebServlet("/Userinput")
public class Userinput extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Userinput() {
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
		String username=request.getParameter("Uname");
		String password = request.getParameter("Pwd");
		
		
		/*
		 * if(password.equals("Admin")) write.print("Welcome "+ username ); else {
		 * write.print("Invalid Login " );
		 * 
		 * }
		 */
		
//		using JSP
		if(password.equals("Admin"))
		{
			System.out.println("All Good...");
			HttpSession session = request.getSession();
			String userName = request.getParameter("Uname");
			System.out.println(userName);

			session.setAttribute("sessionName",userName);
			response.sendRedirect("Success.jsp");
		}
		else {
			
			
			  RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
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

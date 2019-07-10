package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1>unauthorised access</h1>");
		pw.println("<h3>To try again <a href='login.html'>Click here</a></h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("t1");
		String pwd = request.getParameter("t2");
		PrintWriter out=response.getWriter();
		if(name.equals(pwd)) {
			out.println("<h1>");
			out.println("Welcome ! "+ name);
			out.println("</h1>");
			
		}
		else {
			out.println("<h1>Sorry Invalid Credentials...</h1>");
			out.println("<h3>To try again <a href='login.html'>Click here</a></h3>");
			
		}
	}

}

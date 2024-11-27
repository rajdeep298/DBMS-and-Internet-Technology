package org.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().append("Welcome to the servlet world!");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("uemail");
		String pwd = request.getParameter("upwd");
		out.println("<h2>"+"Email:"+email+"</h2>"+"<br>");
		out.println("<h2>"+"Password:"+pwd+"</h2>"+"<br>");
	}

}

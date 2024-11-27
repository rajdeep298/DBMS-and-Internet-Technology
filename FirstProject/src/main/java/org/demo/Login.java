package org.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("uemail");
		String pwd = request.getParameter("upwd");
		
		if(email.equals("admin") && pwd.equals("admin")) {
            RequestDispatcher rd = request.getRequestDispatcher("Welcome");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("Form.html");
            rd.include(request, response);
        }
	}

}

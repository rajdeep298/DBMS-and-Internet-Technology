package org.jdbc.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.jdbc.model.bean.UserBean;
import org.jdbc.model.dao.UserDao;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("uemail");
		String pass=request.getParameter("upass");
		HttpSession session=request.getSession();
		UserBean ub=new UserBean();
		
		ub.setEmail(email);
		ub.setPass(pass);
		
		UserDao ud=new UserDao();
		
		boolean statuslog=ud.login(ub);
		if(statuslog)
		{
			session.setAttribute("data", email);
			response.sendRedirect("index.jsp");
		}
		else {
			response.sendRedirect("login.jsp?msg=invalid");
		}
	}

}

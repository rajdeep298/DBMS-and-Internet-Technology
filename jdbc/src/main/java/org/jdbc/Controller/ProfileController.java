package org.jdbc.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.jdbc.model.bean.UserBean;
import org.jdbc.model.dao.UserDao;

/**
 * Servlet implementation class ProfileController
 */
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val=request.getParameter("msg");
		System.out.println(val);
		if(!val.equals(null))
		{
		UserBean ub=new UserBean();
		ub.setEmail(val);
		
		UserDao ud=new UserDao();
		List<UserBean> ulist=ud.profile(ub);
		request.setAttribute("dlist", ulist);
		RequestDispatcher rd=request.getRequestDispatcher("profile.jsp");
		rd.forward(request, response);
		}
		else {
			response.sendRedirect("login.jsp?msg=false");
		}
	
	}

}

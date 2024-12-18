package org.jdbc.Controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.jdbc.model.bean.UserBean;
import org.jdbc.model.dao.UserDao;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String email=request.getParameter("uemail");
		String phno=request.getParameter("uphno");
		String add=request.getParameter("uadd");
		String pass=request.getParameter("upass");
		
		UserBean ub=new UserBean();
		ub.setName(name);
		ub.setEmail(email);
		ub.setPhno(phno);
		ub.setAddress(add);
		ub.setPass(pass);
		
		UserDao ud=new UserDao();
		int status=ud.insert(ub);
		if(status!=0)
		{
			response.sendRedirect("register.jsp?msg=valid");
		}
		
		boolean statuslog = ud.login(ub);
		if (statuslog) {
			response.sendRedirect("login.jsp?msg=valid");
		} else {
			response.sendRedirect("login.jsp?msg=invalid");
		}
	}

	
	
	
}

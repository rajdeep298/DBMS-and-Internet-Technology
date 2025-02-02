package org.jdbc.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.jdbc.model.bean.UserBean;
import org.jdbc.model.dao.UserDao;

import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("uemail");
        String pass = request.getParameter("upass");

        HttpSession session = request.getSession();

        //Creating UserBean object : Getting login data from user and setting it to UserBean object
        UserBean ub = new UserBean();
        ub.setEmail(email);
        ub.setPass(pass);

        //Creating UserDao object : Calling login method to check if user exists in database
        UserDao ud = new UserDao();
        boolean status = ud.login(ub);
        System.out.println("Login method called. Status: " + status);
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
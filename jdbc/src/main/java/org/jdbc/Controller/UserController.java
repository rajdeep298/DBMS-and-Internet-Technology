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

@WebServlet(name = "UserController", value = "/UserController")
public class UserController extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("uname");
        String email=request.getParameter("uemail");
        String phno=request.getParameter("uphno");
        String add=request.getParameter("uadd");
        String pass=request.getParameter("upass");

        HttpSession session = request.getSession();

        //Creating UserBean object : Getting data from user and setting it to UserBean object
        UserBean ub = new UserBean();
        ub.setName(name);
        ub.setEmail(email);
        ub.setPhno(phno);
        ub.setAdd(add);
        ub.setPass(pass);

        //Creating UserDao object : Calling insert method to insert data into database
        UserDao ud = new UserDao();
        int status = ud.insert(ub);
        System.out.println("Insert method called. Status: " + status);
        if (status != 0) {
            System.out.println("Data inserted successfully!");
            response.sendRedirect("login.jsp?msg=valid");
            return;
        } else {
            System.out.println("Data insertion failed.");
        }

    }
}
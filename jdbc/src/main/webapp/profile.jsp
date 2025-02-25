<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="org.jdbc.model.bean.UserBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Profile</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    height: 100vh;
                    width: 100vw;
                    overflow: hidden;
                    margin: 0;
                    padding: 0;
                    background: beige;
                    display: flex;
                    flex-direction: column;
                    align-items: center;
                }
                header {
                    background: #333;
                    color: #fff;
                    text-align: center;
                    padding: 20px;
                    width: 100%;
                    font-size: 24px;
                    font-weight: bold;
                }
                div {
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    flex-direction: column;
                    background: cadetblue;
                    padding: 20px;
                    border-radius: 10px;
                    font-size: large;
                    font-weight: bold;
                    margin-top: 30px; /* Added margin to create gap */
                }
                button {
                    padding: 10px 20px;
                    margin: 10px;
                    border: none;
                    background: #333;
                    color: #fff;
                    cursor: pointer;
                    border-radius: 5px;
                    transition: background 0.3s ease, box-shadow 0.3s ease;
                }
                button:hover {
                    background: #888820;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                }
                button a {
                    text-decoration: none;
                    color: #fff;
                }
                button a:hover {
                    color: #000;
                }
                input {
                    padding: 10px;
                    margin: 10px;
                    border: none;
                    border-radius: 5px;
                }
                input:hover {
                    background: blanchedalmond;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
                }
            </style>
    </head>
    <body>
        <header><h1>Hi Your Profile:</h1></header>

        <%
            List<UserBean>ulist=(List<UserBean>)request.getAttribute("dlist");
            for(UserBean data:ulist)
            {
                System.out.println(data.getName());
                System.out.println(data.getEmail());
                System.out.println(data.getPhno());
                System.out.println(data.getAdd());
                System.out.println(data.getPass());
        %>
        <div><li>Name Is:<%=data.getName() %></li>
            <li>Email Is:<%=data.getEmail() %></li>
            <li>Phno Is:<%=data.getPhno() %></li>
            <li>Address Is:<%=data.getAdd() %></li>
            <%} %>

            <button><a href="logout.jsp">Logout</a></button>
        </div>
    </body>
</html>
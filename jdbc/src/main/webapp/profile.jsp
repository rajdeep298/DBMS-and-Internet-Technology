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
        body{
            font-family: Arial, sans-serif;
            height: 100vh;
            width: 100vh;
            overflow: hidden;
            margin: 0;
            padding: 0;
            background: beige;
            align-items: center;
        }
        header{
            background: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
            width: 100vw;
        }
        div{
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            background:cadetblue ;
            padding: 10px;
            margin-top: 20px;
            border-radius: 10px;
            font-size: large;
            font-weight: bold;
            margin-top: 20px;
        }
        button{
            padding: 10px 20px;
            margin: 10px;
            border: none;
            background: #333;
            color: #fff;
            cursor: pointer;
            border-radius: 5px;
            border: black;
        }
        button:hover{
            background: #888820;
            box-shadow: 0 0 0 5px #393936;
        }
        button a{
            text-decoration: none;
            color: #fff;
        }
        button a:hover{
            color: #000;
        }
        li{
            padding: 10px;
            margin: 10px;
            border: none;
            border-radius: 5px;
        }
        li:hover{
            background: blanchedalmond;
            box-shadow: 0 0 0 5px #393936;
        }
    </style>
</head>
<body>
<header><h1>Hi Your Profile:</h1></header>

<%
List<UserBean>ulist=(List<UserBean>)request.getAttribute("dlist");
for(UserBean data:ulist)
{
%>
<div><li>Name Is:<%=data.getName() %></li>
    <li>Email Is:<%=data.getEmail() %></li>
    <li>Phno Is:<%=data.getPhno() %></li>
    <li>Address Is:<%=data.getAdd() %></li>
    <%} %>
</div>

</body>
</html>
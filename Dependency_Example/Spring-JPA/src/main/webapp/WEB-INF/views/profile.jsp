<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="org.jdbc.model.bean.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h1>Hi Your Profile:</h1>
<%
List<UserBean>ulist=(List<UserBean>)request.getAttribute("dlist");
for(UserBean data:ulist)
{
%>
<li>Name Is:<%=data.getName() %></li>
<li>Email Is:<%=data.getEmail() %></li>
<li>Phno Is:<%=data.getPhno() %></li>
<li>Address Is:<%=data.getAdd() %></li>
<%} %>
</body>
</html>
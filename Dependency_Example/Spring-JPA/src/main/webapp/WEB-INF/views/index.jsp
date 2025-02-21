<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String str = (String) session.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Welcome to my home page!!</h1>
<br/>
<a href="register">Register</a>|
<a href="login">Login</a>|
<a href="">Logout</a>|
<%="Hello: " +str %>|
<a href="ProfileController?msg=<%=str%>">Profile</a>
</body>
</html>
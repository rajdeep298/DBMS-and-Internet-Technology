<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String str=request.getParameter("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Fill the Details.....</h1>
<%if("valid".equals(str))
	{
	%>
<h3>Sucessfully Registered!</h3>
<%} %>
<form action="UserController" method="POST">
<table>
<tr>
<th>Enter Name:</th><th><input type="text" name="uname"></th>
</tr>
<tr>
<th>Enter Email:</th><th><input type="email" name="uemail"></th>
</tr>
<tr>
<th>Enter Phno:</th><th><input type="phno" name="uphno"></th>
</tr>
<tr>
<th>Enter Address:</th><th><input type="add" name="uadd"></th>
</tr>
<tr>
<th>Enter Password:</th><th><input type="password" name="upass"></th>
</tr>
</table>
<input type="submit" value="Register">
<input type="reset" value="Clear">
</form>
</body>
</html>
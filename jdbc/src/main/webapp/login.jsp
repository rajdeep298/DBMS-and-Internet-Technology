<%--
  Created by IntelliJ IDEA.
  User: rajdeep
  Date: 2/2/2025
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String str = request.getParameter("msg");%>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h1>Login</h1>
    <% if("invalid".equals(str)){%>
    <h3>Please Retry</h3>
    <%}%>
    <form action="LoginController" method="POST">
      <table>
        <tr>
          <th>Enter Email:</th><th><input type="email" name="uemail"></th>
        </tr>
        <tr>
          <th>Enter Password:</th><th><input type="password" name="upass"></th>
        </tr>
      </table>
      <input type="submit" value="Login">
      <input type="reset" value="Clear">
    </form>
  </body>
</html>

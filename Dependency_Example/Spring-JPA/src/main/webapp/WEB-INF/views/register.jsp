<%--
  Created by IntelliJ IDEA.
  User: rajdeep
  Date: 2/2/2025
  Time: 12:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Register</title>
  </head>
  <body>
    <h1>Fill the Details.....</h1>
    <form action="registerprocess" method="POST">
      <table>
        <tr>
          <th>Enter Name:</th><th><input type="text" name="uname"></th>
        </tr>
        <tr>
          <th>Enter Email:</th><th><input type="email" name="uemail"></th>
        </tr>
        <tr>
          <th>Enter Phno:</th><th><input  name="uphno"></th>
        </tr>
        <tr>
          <th>Enter Password:</th><th><input type="password" name="upass"></th>
        </tr>
      </table>
      <h2>${msg }</h2>
      <input type="submit" value="Register">
      <input type="reset" value="Clear">
    </form>
  </body>
</html>

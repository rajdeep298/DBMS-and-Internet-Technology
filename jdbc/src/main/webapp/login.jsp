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
    <header><h1>Login</h1></header>
    <% if("invalid".equals(str)){%>
    <h3>Please Retry</h3>
    <%}%>
    <div>
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
    </div>

  </body>
</html>

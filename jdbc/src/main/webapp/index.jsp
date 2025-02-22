<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% String str = (String) session.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
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
        border-radius: 10px;
        font-size: large;
        font-weight: bold;
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
    input{
        padding: 10px;
        margin: 10px;
        border: none;
        border-radius: 5px;
    }
    input:hover{
        background: blanchedalmond;
        box-shadow: 0 0 0 5px #393936;
    }
  </style>
</head>
<body>
<header>
  <h1>Welcome to my home page!!</h1>
</header>

<br/>
<div>
  <button><a href="register.jsp">Register</a><br></button>
  <button><a href="login.jsp">Login</a><br></button>
  <button><a href="">Logout</a><br></button>
  <%="Hello: " +str %><br>
  <button><a href="ProfileController?msg=<%=str%>">Profile</a></button>
</div>

</body>
</html>
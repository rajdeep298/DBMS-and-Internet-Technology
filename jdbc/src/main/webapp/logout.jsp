<%--
  Created by IntelliJ IDEA.
  User: rajdeep
  Date: 2/23/2025
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("index.jsp?msg=You have been logged out successfully");
%>
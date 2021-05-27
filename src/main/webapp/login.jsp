<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: victorhernandez
  Date: 5/27/21
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
</head>
<body>
<h1>Login Page</h1>

<%
    String Username = request.getParameter("username");
    String Password = request.getParameter("password");
    request.setAttribute("username", Username);
    request.setAttribute("password", Password);
%>

<form action="login.jsp" method="post">
    <br/>Username:<input type="text" name="username">
    <br/>Password:<input type="password" name="password">
    <br/><input type="submit" value="Submit">
</form>

<c:choose>
    <c:when test="${username == 'admin' && password == 'password'}">
        <% response.sendRedirect("/profile.jsp"); %>
    </c:when>
</c:choose>


</body>
</html>

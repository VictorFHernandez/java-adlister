<%--
  Created by IntelliJ IDEA.
  User: victorhernandez
  Date: 6/1/21
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Games</title>
</head>
<body>
<h1>Games available for sale</h1>

<c:forEach var="gameAd" items="${gameAd}">
    <div class="gameAd">
        <h2>${gameAd.name}</h2>
        <p>Price: $ ${gameAd.price}</p>
        <p>Platform: ${gameAd.platform}</p>
    </div>
</c:forEach>

</body>
</html>

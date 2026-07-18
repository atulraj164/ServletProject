<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if (session.getAttribute("sessionid") == null) {
    response.sendRedirect("index.jsp");
}

%>
   <a href="logout">Log Out</a>
    <a href="getAllProduct">View Products</a>
    <a href="Customers">View Customers</a>
    <a href="register.jsp">Register Products</a>
</body>
</html>
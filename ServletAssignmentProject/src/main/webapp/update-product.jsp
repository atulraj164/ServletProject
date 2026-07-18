<%@page import="Dao.StoreDao"%>
<%@page import="Dto.Store"%>
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
			String id=(String)request.getParameter("id");
		
			Store s=new StoreDao().getProductById(Integer.parseInt(id));
			%>
			
			<h4>update form page <%=id%></h4>
			
			<form action="update" method="post">
			
				    <label>ProductID:</label><br>
					<input type="number" name="id" value="<%=s.getId()%>" readonly="readonly"><br>
					
					<label>ProductName:</label><br>
					<input type="text"  name="name" value="<%=s.getName()%>"><br>
					
	
					
					<label>ProductPrice:</label><br>
					<input type="number" name="price" value="<%=s.getPrice()%>"><br>
					
					
					<label>ProductQuantity:</label><br>
					<input type="number"  name="quantity" value="<%=s.getQuantity()%>"><br>
					
					<input type="submit" value="update">
			</form>
		
</body>
</html>

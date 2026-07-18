<%@page import="java.util.List"%>
<%@page import="Dto.Store"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>

<style>

body{
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
}

h2{
    text-align:center;
    margin-top:20px;
}

table{
    width:80%;
    margin:30px auto;
    border-collapse:collapse;
    background:white;
}

th{
    background:#4CAF50;
    color:white;
    padding:12px;
}

td{
    padding:10px;
    text-align:center;
    border:1px solid #ddd;
}

tr:nth-child(even){
    background:#f2f2f2;
}

tr:hover{
    background:#ddd;
}

button{
    padding:6px 12px;
    background:#2196F3;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#1976D2;
}

</style>

</head>

<body>

<%
if (session.getAttribute("sessionid") == null) {
    response.sendRedirect("index.jsp");
}
List<Store> list = (List<Store>) request.getAttribute("storeList");
%>

<h2>All Products</h2>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Action</th>
</tr>

<%

    for(Store s : list){
%>

<tr>
    <td><%= s.getId() %></td>
    <td><%= s.getName() %></td>
    <td><%= s.getPrice() %></td>
    <td><%= s.getQuantity() %></td>

    <td>
       <td><a class="edit"
						href="update-product.jsp?id=<%=s.getId()%>"> Edit </a></td>

					<td><a class="delete"
						href="deleteProduct?id=<%=s.getId()%>"
						onclick="return confirm('Are you sure you want to delete this product?');">

							Delete </a></td>
    </td>
</tr>

<%
    }

%>

</table>

</body>
</html>

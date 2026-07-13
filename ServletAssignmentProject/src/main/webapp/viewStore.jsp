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

table{
    width: 60%;
    margin: 30px auto;
    border-collapse: collapse;
    background-color: white;
}

th{
    background-color: #4CAF50;
    color: white;
    padding: 10px;
}

td{
    padding: 10px;
    text-align: center;
    border: 1px solid #ddd;
}

tr:nth-child(even){
    background-color: #f2f2f2;
}

tr:hover{
    background-color: #ddd;
}
</style>

</head>

<body>

<%
List<Store> list = (List<Store>) request.getAttribute("allProduct");
%>

<h2 style="text-align:center;">All Products</h2>

<table>
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
    </tr>

    <% for(Store s : list){ %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
             <td>
        <a href="update?id=<%= s.getId() %>">
            <button>Update</button>
        </a>
    </td>
        </tr>
    <% } %>

</table>

</body>
</html>

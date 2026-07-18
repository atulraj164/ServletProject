<%@page import="Dto.Customer"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>

<style>

body{
    font-family: Arial, sans-serif;
    background-color:#f4f6f8;
    margin:0;
    padding:30px;
}

h1{
    text-align:center;
    color:#333;
}

table{
    width:70%;
    margin:auto;
    border-collapse:collapse;
    background:white;
    box-shadow:0 0 10px rgba(0,0,0,0.2);
}

th{
    background:#007BFF;
    color:white;
    padding:12px;
}

td{
    padding:10px;
    text-align:center;
}

tr:nth-child(even){
    background:#f2f2f2;
}

tr:hover{
    background:#d6eaf8;
}

</style>

</head>

<body>

<h1>Customer List</h1>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Address</th>
</tr>

<%

if (session.getAttribute("sessionid") == null) {
    response.sendRedirect("index.jsp");
}	

List<Customer> list = (List<Customer>)request.getAttribute("Customer");

for(Customer c : list){
%>

<tr>
    <td><%= c.getId() %></td>
    <td><%= c.getName() %></td>
    <td><%= c.getAddress() %></td>
</tr>

<%
}
%>

</table>

</body>
</html>

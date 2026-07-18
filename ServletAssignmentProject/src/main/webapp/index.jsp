<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Customer Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#74ebd5,#ACB6E5);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:420px;
    background:white;
    padding:30px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

label{
    font-weight:bold;
    color:#555;
}

input[type="text"],
input[type="email"],
input[type="password"]{
    width:100%;
    padding:12px;
    margin-top:6px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:15px;
}

input[type="text"]:focus,
input[type="email"]:focus,
input[type="password"]:focus{
    outline:none;
    border-color:#4CAF50;
    box-shadow:0 0 5px rgba(76,175,80,0.5);
}

input[type="submit"]{
    width:100%;
    padding:12px;
    border:none;
    border-radius:8px;
    background:#4CAF50;
    color:white;
    font-size:17px;
    cursor:pointer;
    transition:.3s;
}

input[type="submit"]:hover{
    background:#388E3C;
}

.links{
    margin-top:25px;
    text-align:center;
}

.links a{
    display:inline-block;
    margin:8px;
    text-decoration:none;
    color:white;
    background:#2196F3;
    padding:10px 18px;
    border-radius:6px;
    transition:.3s;
}

.links a:hover{
    background:#1565C0;
}

</style>

</head>

<body>

<div class="container">

<h2>Customer Registration</h2>

<form action="requestUpload" method="get">

    <label>Name</label>
    <input type="text" name="name" required>

    <label>Email</label>
    <input type="email" name="email" required>

    <label>Password</label>
    <input type="password" name="password" required>

    <label>Mobile</label>
    <input type="text" name="mobile" required>

    <label>Address</label>
    <input type="text" name="address" required>

    <input type="submit" value="Register">

</form>

<div class="links">
    <a href="Login.jsp">Login</a>
   <%String message=(String)request.getAttribute("message");%>
   <a><%=message %></a>
</div>

</div>

</body>
</html>

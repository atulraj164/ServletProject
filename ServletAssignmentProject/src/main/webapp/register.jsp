<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#6dd5ed,#2193b0);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    width:420px;
    background:#fff;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.25);
}

h2{
    text-align:center;
    color:#333;
    margin-bottom:25px;
}

label{
    display:block;
    margin-bottom:6px;
    font-weight:bold;
    color:#555;
}

input[type="text"],
input[type="number"]{
    width:100%;
    padding:12px;
    margin-bottom:18px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:15px;
    transition:0.3s;
}

input[type="text"]:focus,
input[type="number"]:focus{
    outline:none;
    border-color:#2193b0;
    box-shadow:0 0 6px rgba(33,147,176,0.4);
}

input[type="submit"]{
    width:100%;
    padding:12px;
    background:#2193b0;
    color:white;
    border:none;
    border-radius:8px;
    font-size:16px;
    cursor:pointer;
    transition:0.3s;
}

input[type="submit"]:hover{
    background:#176d82;
}

.home{
    text-align:center;
    margin-top:20px;
}

.home a{
    text-decoration:none;
    color:white;
    background:#28a745;
    padding:10px 20px;
    border-radius:8px;
    transition:0.3s;
}

.home a:hover{
    background:#1e7e34;
}

</style>

</head>
<body>

<div class="container">

<h2>Product Registration</h2>

<form action="ProductRegister" method="post">

    <label for="name">Product Name</label>
    <input type="text" id="name" name="name" required>

    <label for="price">Price</label>
    <input type="number" id="price" name="price" step="0.01" required>

    <label for="quantity">Quantity</label>
    <input type="number" id="quantity" name="quantity" required>

    <input type="submit" value="Register">

</form>

<div class="home">
    <a href="index.jsp">Home</a>
</div>

</div>

</body>
</html>

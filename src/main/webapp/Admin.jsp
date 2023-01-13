<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="navBar.jsp"%>
<link rel="stylesheet" type="text/css" href="styles.css">
<link rel="stylesheet" type="text/css" href="welAdmin.css">

<title>Admin</title>
</head>
<body>
<div class="form-register">
<form action="AdminLogin" method="post">
<h4> Fill the required details:</h4>
<label for="name">Name </label>
<input name="name" ID="name" type="text">
<br>

<label for="password">Password</label>
<input name="password" ID="password" type="password">
<br>

<button type="Submit">Login</button>
<br>
<br>

</form>
</div>
</body>
</html>
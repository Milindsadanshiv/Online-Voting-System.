<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="welAdmin.css">
<title>register</title>
<%@include file="navBar.jsp"%>
</head>

<body>
<div class="form-register">
<form action="RegisterVoter" method="post">
<h3>Fill the required details</h3>
<label for="name"> Name: </label>

<input name="name" ID="name" type="text">
<br>
<label for="number">Mo.Number: </label>
<br>
<input name="number" ID="number" type="text">
<br>
<label for="email"> Email: </label>
<br>
<input name="email" ID="email" type="email">
<br>
<label for="voterNumber">Voter Card No.:</label>
<br>
<input name="voterNumber" ID="voterNumber" type="text">
<br>
<label for="address">Address:</label>
<br>
<textarea name="address" ID="address"rows="4" cols="8"></textarea>
<br>
<label for="dob"> Date of Birth: </label>
<br>
<input name="dob" ID="dob" type="date">
<br>
<br>
<button type="Submit">Submit</button>
<br>
<br>
</form>
</div>
</body>
</html>
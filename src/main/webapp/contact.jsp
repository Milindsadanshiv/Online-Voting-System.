<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="navBar.jsp"%>
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Contact us</title>
</head>
<body>
<div class="form-container">
<form action="Contact" method="post">
<h3>Fill the required details</h3>
<label for="name"> Name </label>

<input name="name" ID="name" type="text">
<br>
<br>
<label for="number">Mo.Number </label>
<br>
<input name="number" ID="number" type="text">
<br>
<br>
<label for="email"> Email </label>
<br>
<input name="email" ID="email" type="text">
<br>
<br>
<label for="Comments"> Comment </label>
<br>
<textarea name="name" ID="VoterNumber"rows="4" cols="8"></textarea>
<br>
<button type="Submit">Submit</button>
<br>
<br>
</form>
</div>
</body>
</html>
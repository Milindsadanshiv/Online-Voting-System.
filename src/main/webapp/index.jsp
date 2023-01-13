<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Online Voting System</title>

</head>
<%@include file="navBar.jsp"%>

<body>

<div class="form-container">

<form action="VoterLogin" method="post">
<h3>Enter your Voter ID</h3>
<label for="VoterNumber">Voter ID</label>
<input name="VoterNumber" ID="VoterNumber" type="text">
<br>
<button type="Submit">Login</button>
<br>
<br>

<a href="Admin.jsp" class="index-a">Admin</a>

</form>

</div>
</body>
</html>
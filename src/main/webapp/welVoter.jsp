<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="adminNavbar.jsp"%>
<link rel="stylesheet" type="text/css" href="welAdmin.css">
<title>welcome voter</title>
</head>
<body>
<div class="form-register">
<form action="Vote" method="post">
<h4> Fill the required details:</h4>
<label for="voterID">Voter ID: </label>
<br>
<input name="voterID" ID="voterID" type="text">
<br>

<label for="party">Choose a Party:</label>
<br>
<select name="party" id="party">
  <option value="aap">Aam Aadmi Party</option>
  <option value="bjp">Bhartiya Janta Party</option>
  <option value="bsp">Bahujan Samaj Party</option>
  <option value="cong">Congress</option>
</select>

<button type="Submit">Login</button>
<br>
<br>

</form>
</div>
</body>
</html>
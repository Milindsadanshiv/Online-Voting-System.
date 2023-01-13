<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@page import="java.sql.DriverManager"%> 
   <%@page import="java.sql.ResultSet"%> 
   <%@page import="java.sql.Statement"%> 
   <%@page import="java.sql.Connection"%>   
   <%@page import="java.sql.PreparedStatement"%>     
    
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="table.css">

<title>result</title>

<%
String a[]=new String[100];

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	java.sql.Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineVotingDb","root","Mysqldata@123");

	
	PreparedStatement st=con.prepareStatement("select party,count(party)as c from vote group by party");
	ResultSet rs=((java.sql.Statement)st).executeQuery("select party,count(party)as c from vote group by party");
	
	int i=0;
	while(rs.next())
	{
		a[i]=rs.getString("c");
		i++;
	}
}
%>














</head>
<%@include file="adminNavbar.jsp"%>
<body>
<div class="checkTable">
<table>
<tr>
<th>
Parties
</th>
<th>
Names
</th>

<th>
Votes
</th>
</tr>

<tr>
<td>
<img src="images/aaplogo.jpg" alt="AAP">
</td>
<td>Aam Aadmi Party</td>
<td><%=a[0]==null?0:a[0]%></td>
</tr>


<tr>
<td>
<img src="images/bjp logo.jpg" alt="BJP">
</td>
<td>Bhartiya Janata Party</td>
<td><%=a[1]==null?0:a[1]%></td>
</tr>

<tr>
<td>
<img src="images/bsp logo.jpg" alt="BSP">
</td>
<td>Bahujan Samaj Party</td>
<td><%=a[2]==null?0:a[2]%></td>
</tr>

<tr>
<td>
<img src="images/congress logo.png" alt="CONG">
</td>
<td>Congress</td>
<td><%=a[3]==null?0:a[3]%></td>
</tr>


</table>
</div>
</body>
</html>
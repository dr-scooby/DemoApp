<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" 
    		 import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test DB </title>
</head>
<body>
<h1>Test DB connection to mysql</h1>
Data:
<br>
<%
	try{
	String user = "nurali";
	String password = "java1973";
	String dbname = "Skyhawk";
	String url = "jdbc:mysql://194.168.2.125:3306/"+dbname;
	out.println(url); out.println("<br>");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection(url, user, password);
	Statement stat = conn.createStatement();
	ResultSet rs = stat.executeQuery("select * from contacts");
	while(rs.next()){
		out.println(rs.getString("name")); out.println("<br>");
		out.println(rs.getString("email")); out.println("<br>");
	}
	
	conn.close();
	
	}catch(Exception e){
		out.println(e.getMessage());
	}
	
%>
</body>
</html>
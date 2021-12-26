<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test JSP</title>
</head>
<body>
<%
	int num1 = 9;
	int num2 =9;
	int sum = num1 + num1;
	out.println("sum of numbers " + sum);
	Date d = new Date();
	out.println("<br>");
	out.println("Date: " + d);
	
	int err = 9/0; // this will throw an exception, we will throw it to error.jsp
	out.println(err);
%>
</body>
</html>
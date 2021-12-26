<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<%
	
		// this line prevents the back button in browser after log out
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	/*
	response.setHeader("Pragma", "no-cache"); // HTTP 1.0
	
	response.setHeader("Expires", "0"); // Proxies
	*/
	
		// check if user has logged in first
		if(session.getAttribute("username") == null){
			// username is null, so send user back to the login page
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	Welcome ${username}
	<br>
	Watch exciting videos:
	<a href="videos.jsp">Videos</a>
	<br>
	The Wiki page, full of exciting info:
	<a href="wiki.jsp">wiki</a>
	
	Logout:
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>
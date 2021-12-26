<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<%
		//this line prevents the back button in browser after log out
		// works in HTTP 1.1
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
	<div>
		<h1>VIDEOS</h1>
		<br>
		Welcome ${username}
	</div>
	
	<div>
	4k Video
	<br>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/2CD9aEjFZwU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	
	</div>
<br>

The Wiki page, full of exciting info:
	<a href="wiki.jsp">wiki</a>
<br>

Logout:
	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>
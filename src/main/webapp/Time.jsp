<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*, java.util.*, javax.swing.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date/Time</title>
</head>
<body>

<div>

	<h2>Auto refresh Header Example </h2>
	
	
	<%
	
		// set refresh autoload time as 5 secs
		response.setIntHeader("Refresh", 5);
	
		// get current time
		Calendar cal = new GregorianCalendar();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		String time = "hour: " + hour + ": min: " + min + ": secs: " + sec   ;
		out.println("Current Time: "+ time + "\n");
	
	%>
	
	
	
</div>
</body>
</html>
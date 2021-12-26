<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tech Support</title>
</head>
<body>
<h1>Enter Tech details</h1>

<form action="ShowParam" method="post">

<div>
Name: <input type="text" name="name"><br>
email address: <input type="text" name="email"><br>
Phone: <input type="text" name="phone"><br>
<br>
Select Operating System: <select name="selectos">
<option value="win10">Windows 10</option>
<option value="win7">Windows 7</option>
<option value="linux">Linux</option>
<option value="mac">Mac</option>
</select>
<br>
Importance: <input type="radio" name="importance" value="very">Very, 
<input type="radio"name="importance" value="normal">Normal, 
<input type="radio" name="importance" value="not">Not<br>
<br>
Comment: <br>
<textarea name="textarea"cols="40" rows="5"></textarea>
<br><input value="Submit" type="submit">

</div>

</form>

</body>
</html>
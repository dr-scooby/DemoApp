<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h1>Login page -- punko -- </h1>

	<form action="Login" method="post">
		Enter username: <input type="text" name="uname"><br>
		Enter password: <input type="password" name="pass" id="myInput"><br>
		<input type="checkbox" onclick="myFunction()">Show Password
		<br>
		<input type="submit" value="login">
	
	</form>
 
 <script>
function myFunction() {
  var x = document.getElementById("myInput");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>

</body>
</html>
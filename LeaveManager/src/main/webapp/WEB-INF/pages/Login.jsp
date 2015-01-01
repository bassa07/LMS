<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Login to LMS</title>
</head>
<body>
<h2> Please enter user name and password</h2>
<form action="/LeaveManager/validate.html" method="post">
<input type="text" name="username">
<input type="password" name="pwd">
<input type="submit" value="Login">
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	First Name : <%= request.getAttribute("Fname") %>
	<br>
	Last Name : <%= request.getAttribute("Lname") %>
	<br>
	Email  : <%= request.getAttribute("Email") %>
	<br>
	Password  : <%= request.getAttribute("Pass") %>
	
	

</body>
</html>
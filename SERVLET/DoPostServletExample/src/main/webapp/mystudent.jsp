<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplilearn Registration</title>
</head>
<body>
	<h1> Simplilearn Registration Form</h1>	
	 <form action="<%= request.getContextPath() %>/studentServlet" method="post">
	 
	  First Name: <input type="text" name="firstName">
	 <br> <br> 
	  Last Name: <input type="text" name="lastName">
	 <br> <br> 

	 Email ID: <input type="email" name="emailId">
	 <br> <br> 
	  
	 Password: <input type="password" name="password">
	 <br> <br>
	 
	  <tr>
		<td colspan="2" align="center"><input type="submit" value="Register"/></td>
	 </tr>
	 
	 </form>
</body>
</html>
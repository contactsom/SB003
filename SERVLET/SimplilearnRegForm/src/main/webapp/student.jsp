<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Simplilearn Registration Form</h1>
	 <form action="<%= request.getContextPath() %>/MyStudentServlet" method="get">
	  First Name: <input type="text" name="firstName">
	  <br> <br> 
	  
	  Last Name: <input type="text" name="lastName">
	  <br> <br> 
	  
	  Email ID: <input type="email" name="emailId">
	  <br> <br> 
	  
	  Password: <input type="password" name="password">
	  <br> <br>
	  
	  Gender:
	  <input type="radio" name="gender" value="Male"/>Male
	  <input type="radio" name="gender" value="Female"/>Female
	  <br> <br>
	
		<tr>
			<td>Timing</td>
			<td>
				<select name="timing">
				<option value="Select">Select</option>
				<option value="1.00A.M-2.00A.M">1.00A.M-2.00A.M</option>
				<option value="3.00A.M-4.00A.M">3.00A.M-4.00A.M</option>
				<option value="5.00A.M-6.00A.M">5.00A.M-6.00A.M</option>
				<option value="6.00A.M-7.00A.M">6.00A.M-7.00A.M</option>		
				</select>
			</td>
			
		</tr>
		<br> <br>
		<tr>
			<td>Course</td><br>
			<td><input type="checkbox" name="course" value="Java"/>JAVA<br>
				<input type="checkbox" name="course" value="Jdbc"/>JDBC<br>
				<input type="checkbox" name="course" value="Jsp"/>JSP<br>
				<input type="checkbox" name="course" value="Ejb"/>EJB<br>
				<input type="checkbox" name="course" value="Android"/>ANDROID<br>
			</td>
		</tr>
		<br>
		<tr>
			<td> Remarks</td>
			<td><textarea name="remarks" rows="6" col="20"></textarea></td>
		</tr>
		<br> <br>	
	  
	  <tr>
		<td colspan="2" align="center"><input type="submit" value="Register"/></td>
	 </tr>
	 
	</form>
	
</body>
</html>
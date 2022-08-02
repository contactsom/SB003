<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Swiggy</title>
</head>
<body>


			<jsp:include page="header.jsp">
			
				<jsp:param value="World's No #1 Delivery Portal" name="header"/>				
			
			</jsp:include>
			
				<h1> Welcome to Swiggy !!! Order food to your door </h1>
				<br>
				
				Click on url for redirect to our portal ${param.URL}
				
				<br>
				For any query reach out to our customer carfe at ${param.help}
		
		
			<jsp:include page="footer.jsp">
			
				<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Zomato™ Ltd. All rights reserved." name="footer"/>
			
			</jsp:include>
			
		
</body>
</html>
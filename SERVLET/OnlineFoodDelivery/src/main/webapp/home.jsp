<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
	<body>
	
			
			<jsp:include page="header.jsp">
			
				<jsp:param value="World's No #1 Delivery Portal" name="header"/>				
			
			</jsp:include>
			
			
			<h1> Online Food Delivery Portal </h1>
			
			<h2> Foodie Zone </h2>
			
			<h3> Select your faviourate delivering partner </h3>
			
			<form action="service.jsp">
				<select name="deliveringpartner">
					<option value="SW">Swiggy</option>
					<option value="ZO">Zomato</option>
					<option value="UB">UberEats</option>
					<option value="FO">FoodPanda</option>
				</select>
			
				<input type="submit" value="Submit"/>
				
			</form>
			
			
			<jsp:include page="footer.jsp">
			
				<jsp:param value="By continuing past this page, you agree to our Terms of Service, Cookie Policy, Privacy Policy and Content Policies. All trademarks are properties of their respective owners. 2008-2022 © Zomato™ Ltd. All rights reserved." name="footer"/>
			
			</jsp:include>
		
	</body>


</html>
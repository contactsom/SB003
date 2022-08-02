<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service</title>
</head>
<body>
		<h1> I am from Service</h1>
		
		<%
			String partner = request.getParameter("deliveringpartner");
			if(partner.equalsIgnoreCase("SW"))
			{
		
		%>
		
			<jsp:forward page="swiggy.jsp">
				<jsp:param value="www.swiggy.com" name="URL"/>
				<jsp:param value="help@swiggy.com." name="help"/>
			</jsp:forward>
			
			
			
		<% 
		
			} else if(partner.equalsIgnoreCase("ZO")) {
		
		%>	
		
		
			<jsp:forward page="zomato.jsp">
				<jsp:param value="www.zomato.com" name="URL"/>
				<jsp:param value="help@zomato.com." name="help"/>
			</jsp:forward>
		
		
		<% 
		
			} else if(partner.equalsIgnoreCase("UB")) {
		
		%>
		
			<jsp:forward page="ubereats.jsp">
				<jsp:param value="www.ubereats.com" name="URL"/>
				<jsp:param value="help@ubereats.com." name="help"/>
			</jsp:forward>
		
		
		
		<% 
		
			} else {
		
		%>
		
			<jsp:forward page="foodPanda.jsp">
				<jsp:param value="www.foodPanda.com" name="URL"/>
				<jsp:param value="help@foodPanda.com." name="help"/>
			</jsp:forward>
			
		
		
		<%
			
			}
		%>
		
</body>
</html>
<%@page import="com.simplilearn.beans.Customer" %>

<html>
<head>
<meta charset="UTF-8">
<title>insert.jsp</title>
</head>
<body>
		<%
		
			Customer cust = new Customer();
					 cust.setCid(202);
					 cust.setCname("roger");
					 cust.setEmail("roger@simplilearn.com");
					 cust.setPhone(12345764);
					 
			session.setAttribute("CUST", cust);
			
			
			
			Customer cust1 = new Customer();
					 cust1.setCid(502);
					 cust1.setCname("Gehlotsakshi");
					 cust1.setEmail("Gehlotsakshi@simplilearn.com");
					 cust1.setPhone(9999999);
			 
			session.setAttribute("CUST1", cust1);
		
		%>
		
		<jsp:forward page="display.jsp"/>
</body>
</html>
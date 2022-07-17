<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		Email form Request : <%=request.getAttribute("EM1") %>><br/>
		Email form Session : <%=session.getAttribute("EM2") %>><br/>
		Email form Application : <%=application.getAttribute("EM3") %>><br/>
</body>
</html>
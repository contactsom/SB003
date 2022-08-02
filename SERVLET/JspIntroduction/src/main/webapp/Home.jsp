<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP First Example</title>
</head>
<body>
	<h1> This is my JSP First Example </h1>	
	<h2> START- JSP Decleration </h2>	
	<h2> This is JAVA Code Written in JSP </h2>
	
	<%! 
	  //Write your JAVA code here 
	  	int a=30;
		int b=90;
		String course="JSP From Simplilearn";
		
		
		public int addTwoNumber(){
			return a+b;
		}
		
		public String getCourseName(){
			return course;
		}
		
		public String getBatch(){
			return "We are learning "+course+" !!!";
		}
	%>
	
	<h2> END- JSP Decleration </h2>
	
	<h1> **** START- JAVA Code Response using Scriptlet Tag  *** </h1>	
	<% 
		out.print(a);
		out.print("<br>");
		out.print(b);
		out.print("<br>");
		out.print(course);
		
		out.print("<br>");
		out.print("Addition of two numbers : "+addTwoNumber());
		out.print("<br>");
		out.print("Course Name : "+getCourseName());
		out.print("<br>");
		out.print("Batch : "+getBatch());
	%>
	<h1> **** END- JAVA Code Response using Scriptlet Tag  *** </h1>	
	
	
	<h1> **** START- JAVA Code Response using JSP Expression Tag  *** </h1>
	<%= a %>
	<br>
	<%= b %>
	<br>
	<%= course %>
	<br>
	<%= addTwoNumber() %>
	<br>
	<%= getCourseName() %>
	<br>
	<%= getBatch() %>
	<h1> **** END- JAVA Code Response using JSP Expression Tag  *** </h1>	
	
	
</body>
</html>
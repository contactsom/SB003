package com.simplilearn.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 System.out.println("******* START- This is doGet() ******* ");

			/*1. Get the data from Request parameter*/
			String firstName=(String)request.getParameter("firstName");
			String lastName=(String)request.getParameter("lastName");
			String emailId=(String)request.getParameter("emailId");
			String password=(String)request.getParameter("password");
			
			String gender=(String)request.getParameter("gender");
			String timing=(String)request.getParameter("timing");
			String course[]=request.getParameterValues("course");
			String remarks=(String)request.getParameter("remarks");
			
			
			System.out.println("First Name : "+firstName);
			System.out.println("Last Name : "+lastName);
			System.out.println("Email ID : "+emailId);
			System.out.println("Password : "+password);
			
			System.out.println("Gender : "+gender);
			System.out.println("Timing : "+timing);
			
			for (String c : course) {
				
				System.out.println("Course : "+c);
			}
			
			
			System.out.println("Remarks : "+remarks);
			
			
			/*2. Save the data in to table*/
			
			/*3.Response back the same data to the User*/
				response.setContentType("text/html");
				PrintWriter printWriter = response.getWriter();
		        printWriter.print("<html>");
		        printWriter.print("<body>");
		        printWriter.print("<h1>Simplilearn Registration Form Data</h1>");
		        printWriter.print("<h2>Form submited Successfylly</h2>");
		        printWriter.print("<p> First Name :: " + firstName + "</p>");
		        printWriter.print("<p> Last Name :: " + lastName + "</p>");
		        printWriter.print("<p> Email :: " + emailId + "</p>");
		        printWriter.print("<p> Password :: " + password + "</p>");
		        printWriter.print("</body>");
		        printWriter.print("</html>");
		        printWriter.close();
			
		        /*Home work*/
		        /*Populate all the data in response */
		        System.out.println("******* END- This is doGet() ******* ");
	
	}

}

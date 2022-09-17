package com.simplilearn.httpservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.simplilearn.jdbc.utill.JDBCUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public static final String INSERT="INSERT INTO MYSTUDENT VALUES (?, ?, ?, ?)";
	public static final String UPDATE="";
	public static final String DELETE="";
	public static final String GETBYEMAIL="SELECT * FROM MYSTUDENT WHERE EMAIL = ?";
	
    public StudentServlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("START-***********doPost()****************");

		String path = request.getServletPath();
		System.out.println("What is PATH"+path);
		
		switch (path) {
		
			case "/insert":
					saveData(request,response);
				break;
			case "/getByEmail":
				getByEmail(request,response);
			break;
		}
		
		System.out.println("END-***********doPost()****************");
	}

	private void getByEmail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("START*******getByEmail*******");
		
		Connection con=null;
		
		String emailId=(String)request.getParameter("emailId");
		
		try {
			con=JDBCUtil.getMySqlConnection();
			PreparedStatement pstmt=con.prepareStatement(GETBYEMAIL);
			pstmt.setString(1, emailId);
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String fname = rs.getString("FIRST_NAME");
				String lname = rs.getString("LAST_NAME");
				String email = rs.getString("EMAIL");
				String password = rs.getString("PASSWORD");
				
				displayByEmail(fname,lname,email,password,request,response);
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("emailId-"+emailId);
		
		System.out.println("END*******getByEmail*******");
		
		
	}

	private void displayByEmail(String fname, String lname, String email, String password, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("**********START-displayByEmail()**********");

		request.setAttribute("Fname", fname);
		request.setAttribute("Lname", lname);
		request.setAttribute("Email", email);
		request.setAttribute("Pass", password);
		
		RequestDispatcher rd= request.getRequestDispatcher("searchresult.jsp");
		
		rd.forward(request, response);
		
		System.out.println("**********END-displayByEmail()**********");
		
	}

	public static void saveData(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("START*******saveData*******");
		Connection con=null;
		
		String firstName=(String)request.getParameter("firstName");
		String lastName=(String)request.getParameter("lastName");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		
		System.out.println("firstName-"+firstName);
		System.out.println("lastName-"+lastName);
		System.out.println("emailId-"+emailId);
		System.out.println("password-"+password);
		
		try {
			con=JDBCUtil.getMySqlConnection();
			PreparedStatement pstmt=con.prepareStatement(INSERT);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);	
			pstmt.setString(3, emailId);
			pstmt.setString(4, password);	
			pstmt.execute();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		displayData(request,response);
		System.out.println("END*******saveData*******");
		
	}
	
	public static void displayData(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("**********START-displayData()**********");
		String firstName=(String)request.getParameter("firstName");
		String lastName=(String)request.getParameter("lastName");
		String emailId=(String)request.getParameter("emailId");
		String password=(String)request.getParameter("password");
		
		
		request.setAttribute("Fname", firstName);
		request.setAttribute("Lname", lastName);
		request.setAttribute("Email", emailId);
		request.setAttribute("Pass", password);
		
		
		RequestDispatcher rd= request.getRequestDispatcher("show.jsp");
		
		rd.forward(request, response);
		
		System.out.println("**********END-displayData()**********");
	}

}

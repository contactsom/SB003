package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDeleteExample {

	public static void main(String[] args) throws SQLException {
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");			
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
		
			// TODO Write a query for Delete
			//3 Create the Statement
			PreparedStatement stmt=conn.prepareStatement("");
						
			//stmt.executeUpdate();
			
			// 5. Close the Connection
			conn.close();		
			
		} catch (ClassNotFoundException e) {						
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

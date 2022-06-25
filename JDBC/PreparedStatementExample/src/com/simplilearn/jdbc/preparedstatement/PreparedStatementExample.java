package com.simplilearn.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException {
		try {
			//1. Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");			
			
			//2. Get the Connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn", "root","root12345");	
		
			//3 Create the Statement
			PreparedStatement stmt=conn.prepareStatement("INSERT INTO Employees VALUES (?, ?, ?, ?)");
														//INSERT INTO Employees VALUES (211, 91,'Shreyansh', 'Singh');
														//INSERT INTO Employees VALUES (212, 21,'Nitish', 'Kumar');
														//INSERT INTO Employees VALUES (213, 18,'Robert', 'Junior');
						
			stmt.setInt(1, 211);
			stmt.setInt(2, 91);
			stmt.setString(3, "Shreyansh");
			stmt.setString(4, "Singh");
			stmt.execute();
			
			stmt.setInt(1, 212);
			stmt.setInt(2, 21);
			stmt.setString(3, "Nitish");
			stmt.setString(4, "Kumar");
			stmt.execute();
			
			/*stmt.setInt(1, 213);
			stmt.setInt(2, 18);
			stmt.setString(3, "Robert");
			stmt.setString(4, "Junior");
			stmt.execute();*/
			
			/*int i=0;
			for(i=1;i<5;i++) {
				stmt.setInt(i, 212);
				stmt.setInt(i+1, 21);
				stmt.setString(i+2, "Nitish");
				stmt.setString(i+3, "Kumar");
				stmt.execute();
				i=0;
			}*/
			
			//callable statement
			
			
			
			// 5. Close the Connection
			conn.close();		
			
		} catch (ClassNotFoundException e) {						
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

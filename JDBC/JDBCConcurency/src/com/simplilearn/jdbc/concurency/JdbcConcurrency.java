package com.simplilearn.jdbc.concurency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.jdbc.utill.JDBCUtil;

public class JdbcConcurrency {

	public static void main(String[] args) {
		
		try {
					

			Connection con = JDBCUtil.getMySqlConnection();
		    
			//Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			//Statement stmt = con.createStatement();
			
		    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		    ResultSet rs = stmt.executeQuery("select * from Employees");

  	        System.out.println("***Before Update : Contents of the table:*** ");

		    while(rs.next()) {
		         System.out.print("ID: " + rs.getInt("id"));
		         System.out.print(", Age: " + rs.getInt("age"));
		         System.out.print(", First Name: " + rs.getString("first"));
		         System.out.println(", Last Name: " + rs.getString("last"));
		      }
		    // I am in R4
	    
		    rs.beforeFirst();
		    
		    //Updating the age of each employee by 10 Years
		    while(rs.next()) {
			    	 int age = rs.getInt("age") + 10;//23+50 = 73 
			    	 rs.updateInt( "age", age );
			         rs.updateRow();
		    }
		    
		    
  	        System.out.println("***After Update : Contents of the table:*** ");

		    rs.beforeFirst();

		    while(rs.next()) {
		         System.out.print("ID: " + rs.getInt("id"));
		         System.out.print(", Age: " + rs.getInt("age"));
		         System.out.print(", First Name: " + rs.getString("first"));
		         System.out.println(", Last Name: " + rs.getString("last"));
		      }
		      
		   JDBCUtil.cleanup(stmt, con);
		      
		      
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}

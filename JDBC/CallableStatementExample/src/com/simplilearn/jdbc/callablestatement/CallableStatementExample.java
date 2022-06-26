package com.simplilearn.jdbc.callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.simplilearn.jdbc.utill.JDBCUtil;

public class CallableStatementExample {

	public static void main(String[] args) {
		try {
			Connection con = JDBCUtil.getMySqlConnection();
			
			PreparedStatement stmt = con.prepareCall("{call GetAllEmployee}");/*Calling our Stored Procedure*/
			boolean isExecuted = stmt.execute();/* This method return true is statement executed successfully else false*/ 
			
			if (isExecuted) {
				ResultSet rs = stmt.getResultSet();
				while (rs.next()) {
					
					/* Recive the Data through column index*/
					  System.out.println( 
							  	" ID-"+rs.getInt(1)+" "+ 
							  	" Age-"+rs.getInt(2)+" "+
							  	" First Name-"+rs.getString(3)+" "+ 
							  	" Last Name-"+rs.getString(4) );
					
					  /* Recive the Data through column name*/
					 /* System.out.println(
							  " ID-" + rs.getInt("id") + " " + 
							  " Age-" + rs.getInt("age") + " " +
							  " First Name-" + rs.getString("first") + " " + 
							  " Last Name-" + rs.getString("last"));*/

				}
			} else {
				System.out.println("Error Occured while fatching the data");
			}
			JDBCUtil.cleanup(stmt, con);
			//con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

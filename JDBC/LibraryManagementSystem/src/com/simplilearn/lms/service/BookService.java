package com.simplilearn.lms.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.utill.JDBCUtil;

public class BookService {
 Connection con=null;
 PreparedStatement ps=null;
 ResultSet rs=null;
 
	
	/*1. Verify the User*/
	public String verifyUser(String user,String pass) {
		System.out.println("**********START-verifyUser********");
		String verifyUser="";
		try {
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("select * from USER where USER_NAME = ? and USER_PASS = ? ");
			ps.setString(1, user);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			if(rs.next()) {
				verifyUser="Logged Successfully";
			}else {
				verifyUser="The username or password is incorrect";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		System.out.println("**********END-verifyUser********");
		return verifyUser;
	}


	public int addBook(Book book) {
		System.out.println("**********START-addBook********");
			int noofRecord=0;
		try {
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("INSERT INTO BOOKS VALUES (?,?,?,?,?,?);");
			ps.setInt(1, book.getBid());
			ps.setString(2, book.getBname());
			ps.setString(3, book.getBauthor());
			ps.setString(4, book.getBpublication());
			ps.setInt(5, book.getBprice());
			ps.setString(6, book.getBisbn());
			
			noofRecord=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		System.out.println("**********END-addBook********");
		return noofRecord;
	}


	public int updateBook(int bookId,int bookPrice) {
		int noofRecord=0;
		System.out.println("**********START-updateBook********");
		try {
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("UPDATE BOOKS set BPRICE = ? where BID = ? ");
			ps.setInt(1, bookPrice);
			ps.setInt(2, bookId);
			noofRecord=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		System.out.println("**********END-updateBook********");
		return noofRecord;		
	}


	public int deleteBook(int bookId) {
		int noofRecord=0;
		System.out.println("**********START-deleteBook********");
		try {
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("DELETE FROM BOOKS WHERE BID = ? ");
			ps.setInt(1, bookId);
			noofRecord=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		System.out.println("**********END-deleteBook********");
		return noofRecord;		
		
	}


	public Book getBookById(int bookId) {
		Book book=null;
		
		System.out.println("**********START-getBookById********");
		try {
			con=JDBCUtil.getMySqlConnection();
			ps=con.prepareStatement("SELECT * FROM BOOKS WHERE BID = ? ");
			ps.setInt(1, bookId);
			rs=ps.executeQuery();
			if(rs.next()) {
				book = new Book();
				book.setBid(rs.getInt(1));
				book.setBname(rs.getString(2));
				book.setBauthor(rs.getString(3));
				book.setBpublication(rs.getString(4));
				book.setBprice(rs.getInt(5));
				book.setBisbn(rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(ps, con);
		}
		System.out.println("**********END-getBookById********");
		return book;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

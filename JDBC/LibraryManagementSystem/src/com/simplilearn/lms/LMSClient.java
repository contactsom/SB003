package com.simplilearn.lms;

import com.simplilearn.lms.book.Book;
import com.simplilearn.lms.service.BookService;

public class LMSClient {

	public static void main(String[] args) {

		BookService bookService = new BookService();

		/*1. Login Check*/
		/*String output = bookService.verifyUser("ritesh", "Pass2022");
		  System.out.println(" Login Message ::  "+output);*/
		
		/*2. Add Book*/
		/*Book book = new Book(102, "Effective Java", "Joshua", "Bloch", 600, "186734");
		int record=bookService.addBook(book);
		System.out.println("Record Added ::  "+record);*/
		
		/*3. Update Book*/
		/*int bookId=102;
		int bookPrice=650;
		int updatedRecod=bookService.updateBook(bookId,bookPrice);
		System.out.println("Record Updated :: "+updatedRecod);*/
		
		/*4. Delete the Book*/
		/*int bookId=102;
		int deletedBook=bookService.deleteBook(bookId);
		System.out.println("Record Deleted :: "+deletedBook);*/
		
		/*5. Get book by Book ID */
		int bookId=101;
		Book book=bookService.getBookById(bookId);
		System.out.println(
						"BOOK ID - "+book.getBid() +" "
						+"BOOK NAME - "+book.getBname()+" "
						+"BOOK PRICE - "+book.getBprice()+" "
						+"BOOK PUBLICATION - "+book.getBpublication()+" "
						+"BOOK ISBN - "+book.getBisbn());
		//HOME WORK 
		/*6. Get Book by BOOK NAME*/
		/*7. Get Book by BOOK AUTHOR*/
		/*8. Get Book by BOOK ISBN*/
		/*9. Get Book by BOOK PUBLICATION*/
		/*10. Get Book by BOOK PRICE*/
		/*11. Get ALL BOOK*/
	}

}

package com.cg.client;

import com.cg.entities.Book;
import com.cg.service.BookService;
import com.cg.service.IBookService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBookService service = new BookService();
		System.out.println("===========Total number of books===========");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("====================Books with id = 105================");
		System.out.println(service.getBookById(105));
		
		System.out.println("====================All books==================");
		for(Book book : service.getAllBooks()) {
			System.out.println(book);
		}
		
		System.out.println("===============Books written by Danny Coward=================");
		for(Book book:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(book);
		}
		
		System.out.println("=================Book having title = Android=================");
		for(Book book:service.getBooksByTitle("Android")) {
			System.out.println(book);
		}
		
		System.out.println("===============All books between 500 and 600================");
		for(Book book:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(book);
		}
	}

}

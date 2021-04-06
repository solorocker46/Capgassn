package com.cg.service;

import java.util.List;

import com.cg.entities.Book;

public interface IBookService {
	Book getBookById(int id);
	List<Book> getBooksByTitle(String title);
	long getBookCount();
	List<Book> getAuthorBooks(String author);
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(double low, double high);
}

package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public interface IBookDao {
	Book getBookById(int id);
	List<Book> getBooksByTitle(String title);
	long getBookCount();
	List<Book> getAuthorBooks(String author);
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(double low, double high);
}

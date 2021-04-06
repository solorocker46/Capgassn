package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.Book;

public class BookDao implements IBookDao {
	private EntityManager em;
	
	public BookDao() {
		super();
		em = JPAUtil.getEntityManager();
		/*em.getTransaction().begin();
		Book b = new Book();
		b.setId(108);
		b.setAuthor("Demi James");
		b.setTitle("Everything on Android");
		b.setPrice(500);
		em.persist(b);
		em.getTransaction().commit();*/
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book = em.find(Book.class, id);
		return book;
	}

	@Override
	public List<Book> getBooksByTitle(String title) {
		// TODO Auto-generated method stub
		String sql = "select book from Book book where book.title = :ptitle";
		Query q = em.createQuery(sql);
		q.setParameter("ptitle", "%"+title+"%");
		List<Book> bookList = q.getResultList();
		return bookList;
	}

	@Override
	public long getBookCount() {
		// TODO Auto-generated method stub
		String sql = "select count(book) from Book book";
		Query q = em.createQuery(sql);
		long count = (long)q.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		String sql = "select book from Book book where book.author = :pauthor";
		TypedQuery<Book> q = em.createQuery(sql, Book.class).setParameter("pauthor", author);
		List<Book> book = q.getResultList();
		return book;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		String sql = "select book from Book book";
		TypedQuery<Book> q = em.createQuery(sql, Book.class);
		List<Book> book = q.getResultList();
		return book;
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		String sql = "select book from Book book where book.price between :plow and :phigh";
		TypedQuery<Book> q = em.createQuery(sql, Book.class);
		q.setParameter("plow", low);
		q.setParameter("phigh", high);
		List<Book> book = q.getResultList();
		return book;
	}
	
}

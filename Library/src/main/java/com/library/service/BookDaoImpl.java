package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.library.dao.BookDao;
import com.library.model.Book;

public class BookDaoImpl {

	@Autowired
	private BookDao bdao;
		
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bdao.findAll();
	}

	
	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		return bdao.save(book);
	}

		public Book updateBook(Book b) {
		// TODO Auto-generated method stub
		return bdao.save(b);
	}

	
	public void deleteBook(int bookid) {
		// TODO Auto-generated method stub
		 bdao.deleteById(bookid);
	}
}

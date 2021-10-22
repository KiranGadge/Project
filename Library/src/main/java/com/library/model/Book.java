package com.library.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Book {
	@Id
	private int bookid;
	private String bookname;
	private String author;
	
	public Book() {
		
	}

	public Book(int bookid, String bookname, String author) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book has--> bookid=" + bookid + ", bookname=" + bookname + ", author=" + author ;
	}
	
	
	
	}

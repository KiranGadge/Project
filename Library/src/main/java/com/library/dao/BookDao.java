package com.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}

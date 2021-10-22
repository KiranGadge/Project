package com.library.dao;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Book;

@SpringBootApplication
public interface BookDao extends JpaRepository<Book, Integer>{

}

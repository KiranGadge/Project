package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.library.dao.BookDao;
import com.library.model.Book;

@Controller
public class BookController {

	@Autowired
	private BookDao bdao;
	
	@GetMapping(value="/list")
	public String getAllBooks(Model m)
	{
		List<Book> blist=bdao.findAll();
		m.addAttribute("booklist",blist);
		return "Booklist";
	}
	
	@GetMapping(value="/addBook")
	public String insertBook(@ModelAttribute("add") Book book)
	{
		bdao.save(book);
		return "redirect:/list";
		
	}
	
	@PostMapping(value="/updateBook")
	public String updateBook(@ModelAttribute("update") Book b)
	{
		bdao.save(b);
		return "redirect:/list";
	}
	
	@PostMapping(value="/deleteBook")
	public String deleteBook(@ModelAttribute("delete") int bookid)
	{
		bdao.deleteById(bookid);
		return "redirect:/list";
		
	}
}

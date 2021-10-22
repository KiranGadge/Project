package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.library.dao.BookDao;
import com.library.model.Book;

@Controller
public class BookController {

	@Autowired
	private BookDao bdao;
	
	@GetMapping(value="/")
	public String getAllBooks(Model m)
	{
		List<Book> blist=bdao.findAll();
		System.out.println(blist);
		m.addAttribute("booklist",blist);
		return "Booklist";
	}
	
	@GetMapping(value="/add")
	public String insertBook(@ModelAttribute("add") Book book)
	{
		bdao.save(book);
		return "redirect:/";
		
	}
	
	@GetMapping(value="/index")
	public String add()
	{
		return "index";
	}
	@GetMapping(value="/edit/{bookid}")
	public String editBook(@PathVariable int bookid,Model m)
	{
		Book b=bdao.getById(bookid);
		m.addAttribute("book",b);
		return "index";
	}
	
	@GetMapping(value="/delete/{bookid}")
	public String deleteBook(@PathVariable int bookid,Model m)
	{
		bdao.deleteById(bookid);
		return"redirect:/";
	}
	@PostMapping(value="/edit/updateBook")
	public String updateBook(@ModelAttribute("update") Book b)
	{
		bdao.save(b);
		return "redirect:/";
	}
	
	@PostMapping(value="/delete")
	public String deleteBook(@ModelAttribute("delete") int bookid)
	{
		bdao.deleteById(bookid);
		return "redirect:/";
		
	}
}

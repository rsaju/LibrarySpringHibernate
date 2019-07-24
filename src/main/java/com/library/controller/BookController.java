package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.Book;
import com.library.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookservice;
	
	@RequestMapping(value="/viewbook")
	public ModelAndView viewBook(ModelAndView model)
	{
		List<Book> bk=bookservice.getAllBook();
		for (Book book : bk) {
			System.out.println(book.getBookname());
			System.out.println(book.getCount());
		}
		model.addObject("bk",bk);
		model.setViewName("book");
		return model;
	}
}

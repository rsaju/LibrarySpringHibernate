package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.DAO.BookDao;
import com.library.model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookdao;
	
	@Override
	public List<Book> getAllBook() {
		
		return bookdao.getAllBooks();
	}

}

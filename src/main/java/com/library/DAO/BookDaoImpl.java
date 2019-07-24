package com.library.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		
		return sessionfactory.getCurrentSession().createQuery("from Book").list();
	}

}

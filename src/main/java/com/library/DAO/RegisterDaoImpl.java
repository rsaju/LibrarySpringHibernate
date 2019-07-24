package com.library.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Login;
import com.library.model.Register;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public void addUser(Register reg) {
		sessionfactory.getCurrentSession().saveOrUpdate(reg);
	}

	@Override
	public void addLogUser(Login log) {
		sessionfactory.getCurrentSession().saveOrUpdate(log);
	}

}

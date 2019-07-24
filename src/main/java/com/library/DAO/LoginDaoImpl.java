package com.library.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.model.Login;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean loginCheck(Login user) 
	{
		boolean userFound=false;
		String username=user.getUsername();
		String password=user.getPassword();
		Query query=sessionfactory.getCurrentSession().createQuery("from Login as l where l.username=? and l.password=?");
		query.setParameter(0, username);
		query.setParameter(1, password);
		@SuppressWarnings("unchecked")
		List<Login> us = query.list();
		if((us !=null)&(us.size()>0))
		{
			userFound=true;
		}
		else
		{
			userFound=false;
		}
		return userFound;
	}

}

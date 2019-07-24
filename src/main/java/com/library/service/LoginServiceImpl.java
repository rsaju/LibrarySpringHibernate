package com.library.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.DAO.LoginDao;
import com.library.model.Login;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	public boolean loginCheck(Login user) {
		
		return loginDao.loginCheck(user);
	}

}

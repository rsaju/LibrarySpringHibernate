package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.DAO.RegisterDao;
import com.library.model.Login;
import com.library.model.Register;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	@Override
	public void addUser(Register reg) {
		registerDao.addUser(reg);

	}

	@Override
	public void addLogUser(Login log) {
		registerDao.addLogUser(log);
	}

}

package com.library.service;

import com.library.model.Login;
import com.library.model.Register;

public interface RegisterService {

	public void addUser(Register reg);
	public void addLogUser(Login log);
}

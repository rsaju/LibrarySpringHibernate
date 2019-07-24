package com.library.DAO;

import com.library.model.Login;
import com.library.model.Register;

public interface RegisterDao {
	
	public void addUser(Register reg);
	public void addLogUser(Login log);
}

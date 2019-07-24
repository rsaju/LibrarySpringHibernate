package com.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.Login;
import com.library.model.Register;
import com.library.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerservice;
	
	@RequestMapping(value="/newUser")
	public ModelAndView showRegister(ModelAndView model)
	{
		Register reg = new Register();
		Login log= new Login();
		model.addObject("reg",reg);
		model.addObject("log",log);
		model.setViewName("register");
		return model;
	}
	
	@RequestMapping(value="/registeraction",method=RequestMethod.POST)
	public String registerAction(@ModelAttribute Register reg,Login log, HttpServletRequest request)
	{
		registerservice.addUser(reg);
		registerservice.addLogUser(log);
		return "redirect:/";
	}
}

package com.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.Login;
import com.library.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value="/login")
	public ModelAndView showLogin(ModelAndView model)
	{
		Login user=new Login();
		model.addObject("user",user);
		model.setViewName("home");
		return model;		
	}
	
	@RequestMapping(value="/loginAction" ,method=RequestMethod.POST)
	public String loginAction(@ModelAttribute Login user,HttpServletRequest request)
	{
		String page;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		user.setUsername(username);
		user.setPassword(password);
		boolean p=loginservice.loginCheck(user);
		if(p==true)
		{
			page="homepage";
		}
		else
		{
			page="/";
		}
		return page;
	}
}
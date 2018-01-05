package com.lps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lps.service.UserService;

@Controller
@RequestMapping(value="/login")
public class LoginController extends BaseController {
	
	/*@Autowired
	UserService userService;
	
	@RequestMapping(value="index")
	public String index(){
		request.getSession().setAttribute("1", "2");
		return "/index.html";
	}
	
	@RequestMapping(value="toLogin")
	public String toLogin(){
		return "/login";
	}*/
}

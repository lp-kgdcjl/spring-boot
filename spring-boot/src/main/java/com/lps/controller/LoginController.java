package com.lps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lps.entity.User;
import com.lps.service.UserService;

@Controller
@RequestMapping(value="/login")
public class LoginController extends BaseController {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/login")
	public String login(){
		User x = null;
		try {
			x = userService.selectById(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x.toString();
	}
}

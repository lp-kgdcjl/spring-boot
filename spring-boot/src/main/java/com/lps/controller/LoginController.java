package com.lps.controller;

import java.util.List;

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
		List<User> l = null;
		try {
			x = userService.selectById(2);
			l = userService.selectByObj(new User());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return x.toString();
	}
}

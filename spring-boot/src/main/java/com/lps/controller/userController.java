package com.lps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lps.entity.User;
import com.lps.service.UserService;

@Controller
@RequestMapping(value="/user")
public class userController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="")
	public String index(){
		List<User> xx = userService.select(new User());
		return "/user/userList";
	}
}

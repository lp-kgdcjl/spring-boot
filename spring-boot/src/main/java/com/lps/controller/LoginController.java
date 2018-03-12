package com.lps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/login")
public class LoginController extends BaseController {
	
	@RequestMapping(value="/login")
	public void login(){
		
	}
}

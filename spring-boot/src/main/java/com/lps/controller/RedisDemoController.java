package com.lps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lps.entity.User;

@Controller
@RequestMapping(value="/redis")
public class RedisDemoController extends BaseController {

	@RequestMapping(value="/demo")
	public void login(){
		User user = new User();
		user.setId(1);
		user.setNickname("hello redis");
		redisTemplate.opsForValue().set("q", user);
		System.out.println(redisTemplate.opsForValue().get("q").getClass());
		User user2 = (User) redisTemplate.opsForValue().get("q");
		System.out.println(user2.getNickname());
	}
}

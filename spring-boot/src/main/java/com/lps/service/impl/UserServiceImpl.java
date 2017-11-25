package com.lps.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lps.dao.UserDao;
import com.lps.entity.User;
import com.lps.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	public List<User> select(User user){
		return userDao.select(user);
	}
}

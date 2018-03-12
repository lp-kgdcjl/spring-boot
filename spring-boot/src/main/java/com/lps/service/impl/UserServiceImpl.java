package com.lps.service.impl;

import org.springframework.stereotype.Service;

import com.lps.dao.UserDao;
import com.lps.entity.User;
import com.lps.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserDao> implements UserService{
	
}

package com.cn.ek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ek.mapping.UserMapper;
import com.cn.ek.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void add(User user){
		userMapper.add(user);
	}
	
}

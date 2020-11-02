package com.igeek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igeek.bean.User;
import com.igeek.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	public User findById(String uid) {
		return userMapper.findById(uid);
	}
}

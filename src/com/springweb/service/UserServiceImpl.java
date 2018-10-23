package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.dao.UserDaoImpl;
import com.springweb.model.User;
@Service
public class UserServiceImpl {
	private UserDaoImpl userDaoimpl;
	
@Autowired
	public void setUserDaoimpl(UserDaoImpl userDaoimpl) {
		this.userDaoimpl = userDaoimpl;
	}
	public void create(User user) {
		userDaoimpl.create(user);

	}
	public boolean exists(String username) {
		
		return userDaoimpl.exists(username);
	}

}

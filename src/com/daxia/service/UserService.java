package com.daxia.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.daxia.dao.UserDAO;
import com.daxia.model.User;

@Component("userService")
public class UserService {
	//userDAO  具体实现依靠注入来操作
	private UserDAO userDAO; 

	public void init(){
		System.out.println("init");
	}
	//add  
	public void add(User user){
		userDAO.save(user);
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void destroy(){
		System.out.println("destory");
	}
}

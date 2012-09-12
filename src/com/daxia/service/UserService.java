package com.daxia.service;

import com.daxia.dao.UserDAO;
import com.daxia.dao.impl.UserDAOImpl;
import com.daxia.model.User;

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

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void destroy(){
		System.out.println("destory");
	}
	
}

package com.daxia.service;

import com.daxia.dao.UserDAO;
import com.daxia.dao.impl.UserDAOImpl;
import com.daxia.model.User;

public class UserService {
	//userdaoimpl 具体实现（需要哪个数据库，就new 哪一个）
	private UserDAO userDAO = new UserDAOImpl(); 

	//add  添加数据（无需考虑底层的数据库，底层的数据库由DAO来处理）
	public void add(User user){
		userDAO.save(user);
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}

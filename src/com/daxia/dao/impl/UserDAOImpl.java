package com.daxia.dao.impl;

import com.daxia.dao.UserDAO;
import com.daxia.model.User;

public class UserDAOImpl implements UserDAO {
	private User user;

	public void  save(User u){
		System.out.println("a user saved !");
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

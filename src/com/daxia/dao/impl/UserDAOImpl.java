package com.daxia.dao.impl;

import org.springframework.stereotype.Component;

import com.daxia.dao.UserDAO;
import com.daxia.model.User;

@Component
public class UserDAOImpl implements UserDAO {
	
	public void  save(User u){
		System.out.println("a user saved !");
	}

}

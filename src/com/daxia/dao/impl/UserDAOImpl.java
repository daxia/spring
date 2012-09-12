package com.daxia.dao.impl;

import com.daxia.dao.UserDAO;
import com.daxia.model.User;

public class UserDAOImpl implements UserDAO {
	
	private String daoId;

	public void  save(User u){
		System.out.println("a user saved !");
	}

	public String getDaoId() {
		return daoId;
	}

	public void setDaoId(String daoId) {
		this.daoId = daoId;
	}
	
	public String toString(){
		return "daoId = " + daoId;
	}
	
}

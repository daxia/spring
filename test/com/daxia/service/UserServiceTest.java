package com.daxia.service;

import org.junit.Test;

import com.daxia.dao.UserDAO;
import com.daxia.model.User;
import com.daxia.spring.BeanFactory;
import com.daxia.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory factory = new ClassPathXmlApplicationContext();
		
		UserService service = (UserService) factory.getBean("userService");
		//UserDAO userDAO = (UserDAO) factory.getBean("u");
		//service.setUserDAO(userDAO);
		User u = new User();
		service.add(u);
	}

}

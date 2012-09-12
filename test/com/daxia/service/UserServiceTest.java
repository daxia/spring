package com.daxia.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxia.model.User;
//Dependency Injection
//Invorce 
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService) act.getBean("userService");
		
		act.destroy();
	}
}

package com.daxia.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daxia.model.User;
//Dependency Injection
//Invorce 
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService) act.getBean("userService");
		service.add(new User());
		act.destroy();
	}
	
	/*@Test
	public void testProxy(){
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
		userDAOProxy.save(new User());
		userDAO.delete();
		
	}*/
}

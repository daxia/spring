package com.daxia.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component //初始化
public class LogInterceptor {
	@Before("execution(public void com.daxia.dao.impl.UserDAOImpl.save(com.daxia.model.User))")
	public void beforeMethod() {
		System.out.println("method start...");
	}
}

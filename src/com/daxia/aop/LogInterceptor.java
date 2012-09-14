package com.daxia.aop;


/*@Aspect
@Component*/ //本身需要初始化
public class LogInterceptor {
	//@Before("execution(public void com.daxia.dao.impl.UserDAOImpl.save(com.daxia.model.User))")
	public void before() {
		System.out.println("method start...");
	}
}

package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.jspiders.springcore.bean.User;
import com.jspiders.springcore.config.UserConfig;

public class UserMain1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(UserConfig.class);
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		((AbstractApplicationContext) applicationContext).close();
		
		ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(UserConfig.class);
		User user1 = (User) applicationContext1.getBean("user1");
		System.out.println(user1);
		((AbstractApplicationContext) applicationContext1).close();
		
		ApplicationContext applicationContext2=new AnnotationConfigApplicationContext("com.jspiders.springcore.bean");
		User user2 = (User) applicationContext2.getBean("User1");
		System.out.println(user2);
		((AbstractApplicationContext) applicationContext2).close();
	}

}

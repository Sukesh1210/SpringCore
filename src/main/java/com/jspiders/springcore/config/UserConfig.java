package com.jspiders.springcore.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcore.bean.User;

public class UserConfig {
	
	@Bean(name="user1")
	public User getuser() {
		return new User();
	}

}

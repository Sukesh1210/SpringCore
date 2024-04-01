package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component(value="User1")
public class User {

	@Value("1")
	private int id;
	@Value("Sukesh")
	private String name;
	@Value("sukesh@gmail.com")
	private String email;
}

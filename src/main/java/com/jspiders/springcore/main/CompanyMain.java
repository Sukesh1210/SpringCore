package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.entity.Company;

public class CompanyMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("company_config.xml");
		Company company = applicationContext.getBean(Company.class);
		System.out.println(company);
	}

}

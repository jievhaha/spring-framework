package com.PropertyPlaceholderConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFun {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-property.xml");
		Test test = (Test) applicationContext.getBean("test");
		System.out.println(test.getName());
	}
}

package com.conversiontest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

public class ConversionTest implements Serializable {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("application-Conversion.xml");
		People people = (People) app.getBean("people");
		System.out.println(people.getPeopleService());
	}
}

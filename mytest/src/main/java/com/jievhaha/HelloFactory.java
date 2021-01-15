package com.jievhaha;

public class HelloFactory {
	public static HelloDepend getHello(String age, String name, Address address){
		return new HelloDepend(age,name,address);
	}
}

package com.jievhaha;

public class Hello {
	private Integer age;
	private String name;
	private String address;

	public Hello(Integer age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void sayHello() {
		System.out.println(this.name + "今年" + this.age + "岁，" + "住在" + this.address);
	}
}

package com.jievhaha;

public class HelloDepend {
	private String age;
	private String name;
	private Address address;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HelloDepend(String age, String name, Address address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public HelloDepend() {
	}

	@Override
	public String toString() {
		return "我叫" + name + "，今年" + age + "岁，来自" + address;
	}
}

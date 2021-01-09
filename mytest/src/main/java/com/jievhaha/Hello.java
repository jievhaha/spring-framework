package com.jievhaha;

public class Hello {
	private String id;
	private Integer age;
	private String name;
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Hello() {
	}

	public void sayHello() {
		System.out.println(this.name + "今年" + this.age + "岁，" + "住在" + this.address);
	}
}

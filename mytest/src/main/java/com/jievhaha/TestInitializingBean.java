package com.jievhaha;

import org.springframework.beans.factory.InitializingBean;

public class TestInitializingBean implements InitializingBean {
	private String name;
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init...");
		this.name = "jievhahaTest";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

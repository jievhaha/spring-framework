package com.jievhaha;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, BeanPostProcessor, InitializingBean, DisposableBean {
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		System.out.println("属性注入....");
		this.test = test;
	}

	public LifeCycleBean(String test) {
		System.out.println("有参构造函数调用...");
		this.test = test;
	}

	public LifeCycleBean() {
		System.out.println("无参构造函数调用...");
	}

	public void display(){
		System.out.println("方法调用...");
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanClassLoaderAware 被调用...");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware 被调用...");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware 被调用...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy 被调动...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet 被调动...");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor postProcessBeforeInitialization 被调用...");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor postProcessAfterInitialization 被调用...");
		return bean;
	}

	public void initMethod(){
		System.out.println("init-method 被调用...");
	}

	public void destroyMethod(){
		System.out.println("destroy-method 被调用...");
	}
}

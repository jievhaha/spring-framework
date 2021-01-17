package com.jievhaha;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestAware implements ApplicationContextAware,BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {
	private ClassLoader classLoader;
	private String beanName;
	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;
	@Override
	public void setBeanName(String name) {
		System.out.println("调用了BeanNameAware的setBeanName...");
		this.beanName = name;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("调用了BeanClassLoaderAware的setBeanClassLoader...");
		this.classLoader = classLoader;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("调用了BeanFactoryAware的setBeanFactory");
		this.beanFactory =beanFactory;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("调用了ApplicationContextAware的setApplicationContext");
		this.applicationContext = applicationContext;
	}

	public void display(){
		System.out.println("beanName:" + this.beanName);
		System.out.println("是否为单例：" + this.beanFactory.isPrototype(this.beanName));
		//System.out.println("系统环境为：" + applicationContext.getEnvironment());
	}
}

package com.jievhaha;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml"); // <1>
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		reader.loadBeanDefinitions(resource);



		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello)ac.getBean("hello");
		hello.sayHello();

		ResourceLoader resourceLoader = new DefaultResourceLoader();
		//以下结果为false、true、true、true
		//如果改为FileSystemResourceLoader，则结果为true、false、true、true
		// ResourceLoader resourceLoader = new FileSystemResourceLoader();
		Resource resource1 = resourceLoader.getResource("/home/jievhaha/Documents/workspace/gitworkspace/spring-framework/mytest/src/main/java/com/jievhaha/Hello.java");
		System.out.println("resource1 is FileSystemResource:" + (resource1 instanceof FileSystemResource));
		System.out.println("fileResource2 is ClassPathResource:" + (resource1 instanceof ClassPathResource));
		Resource urlResource1 = resourceLoader.getResource("file:/home/jievhaha/Documents/workspace/gitworkspace/spring-framework/mytest/src/main/java/com/jievhaha/Hello.java");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));
	}
}

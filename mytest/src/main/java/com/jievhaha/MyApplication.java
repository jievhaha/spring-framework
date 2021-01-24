package com.jievhaha;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		LifeCycleBean lifeCycleBean = new LifeCycleBean();
		// BeanFactory 容器一定要调用该方法进行 BeanPostProcessor 注册
		factory.addBeanPostProcessor(lifeCycleBean);
		reader.loadBeanDefinitions(resource);
		LifeCycleBean lifeCycleBean1 = (LifeCycleBean) factory.getBean("lifeCycle");
		lifeCycleBean1.display();
		System.out.println("方法调用完成，容器开始关闭....");
        // 关闭容器
		factory.destroySingletons();
		/*ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		TestAware testAware = (TestAware) defaultListableBeanFactory.getBean("testAware");
		testAware.display();*/
		/*ApplicationContext app = new ClassPathXmlApplicati
onContext("applicationContext.xml");

		TestAware testAware = (TestAware) app.getBean("testAware");
		testAware.display();*/

		/*ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		TestBeanPostProcessor beanPostProcessor = new TestBeanPostProcessor();
		factory.addBeanPostProcessor(beanPostProcessor);
		reader.loadBeanDefinitions(resource);
		TestBeanPostProcessor testBeanPostProcessor = (TestBeanPostProcessor) factory.getBean("testBeanPostProcessor");
		testBeanPostProcessor.display();*/

		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBeanPostProcessor testBeanPostProcessor1 = (TestBeanPostProcessor) applicationContext.getBean("testBeanPostProcessor");
		testBeanPostProcessor1.display();*/

		/*ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		TestBeanPostProcessor beanPostProcessor = new TestBeanPostProcessor();
		factory.addBeanPostProcessor(beanPostProcessor);
		reader.loadBeanDefinitions(resource);
		TestInitializingBean initializingBean = (TestInitializingBean) factory.getBean("testInitializingBean");
		System.out.println(initializingBean.getName());*/

		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestInitializingBean testInitializingBean = (TestInitializingBean) applicationContext.getBean("testInitializingBean");
		System.out.println(testInitializingBean.getName());*/

		/*HelloDepend helloDepend = (HelloDepend) app.getBean("hello");
		System.out.println(helloDepend);*/


		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hello.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		hello.sayHello();*/
		/*ClassPathResource resource = new ClassPathResource("applicationContext.xml"); // <1>
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
		System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof  UrlResource));*/
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) applicationContext.getBean("hello");
		hello.sayHello();*/
	}
}

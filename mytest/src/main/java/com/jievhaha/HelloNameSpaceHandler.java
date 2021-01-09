package com.jievhaha;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class HelloNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("hello",new HelloDefinitionParser());
	}
}

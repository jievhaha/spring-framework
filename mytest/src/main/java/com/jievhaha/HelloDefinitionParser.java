package com.jievhaha;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class HelloDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return Hello.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String age = element.getAttribute("age");
		String name = element.getAttribute("name");
		String address = element.getAttribute("address");
		if(StringUtils.hasLength("id")){
			builder.addPropertyValue("id", id);
		}
		if(StringUtils.hasLength(age)){
			builder.addPropertyValue("age", age);
		}
		if(StringUtils.hasText(name)){
			builder.addPropertyValue("name", name);
		}
		if(StringUtils.hasLength(address)){
			builder.addPropertyValue("address", address);
		}
	}
}

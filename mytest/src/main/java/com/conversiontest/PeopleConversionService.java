package com.conversiontest;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

public class PeopleConversionService implements Converter<String, PeopleService> {
	@Override
	public PeopleService convert(String source) {
		if(StringUtils.hasLength(source)){
			String[] sources = source.split("#");
			PeopleService peopleService = new PeopleService();
			peopleService.setAge(Integer.parseInt(sources[0]));
			peopleService.setName(sources[1]);
			return peopleService;
		}
		return null;
	}
}

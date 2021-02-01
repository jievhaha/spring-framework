/*
package com.PropertyPlaceholderConfigurer;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CustomPropertyConfig extends PropertyPlaceholderConfigurer {
	private Resource[] locations;
	private PropertiesPersister propertiesPersister = new DefaultPropertiesPersister();

	public Resource[] getLocations() {
		return locations;
	}

	@Override
	public void setLocations(Resource[] locations) {
		this.locations = locations;
	}

	*/
/**
	 * 重写该方法，根据启动参数，动态读取配置文件
	 * @param props the Properties instance to load into
	 * @throws IOException
	 *//*

	@Override
	protected void loadProperties(Properties props) throws IOException {
		if(locations != null){
			for(Resource location: locations){
				InputStream is = null;
				try{
					String fileName = location.getFilename();
					String env = "application-" + System.getProperty("spring.profiles.active", "dev") + ".properties";
					//找到所需，加载
					if(fileName.contains(env)){
						is = location.getInputStream();
						this.propertiesPersister.load(props,is);
					}
				}catch (IOException e){
					logger.info("加载资源文件失败...");
					throw e;
				}finally {
					if(is != null){
						is.close();
					}
				}
			}
		}
	}
}
*/

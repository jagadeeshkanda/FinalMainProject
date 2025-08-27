package config;

import java.io.IOException;
import java.util.Properties;

public class ProjectConfigaration {
	private  Properties prop;
	private static ProjectConfigaration config;
	
	public ProjectConfigaration() {
		prop = getconfig();
	}
	
	public  Properties getconfig() {
		try {
			ClassLoader classloader = getClass().getClassLoader();
			prop = new Properties();
			prop.load(classloader.getResource("config.properties").openStream());
			return prop;
		} catch(IOException ex){
			throw new RuntimeException("Unable to read the file",ex);
		}
	}
	
	public static ProjectConfigaration getInstance() {
		if(config == null) {
			config = new ProjectConfigaration();
		}
		return config;
	}

	public  String getValue(String key) {
		return System.getProperty(key,prop.getProperty(key));
	}
	
}

package config;

public class Configuration {
	
	//This method is used to get the test type for eg: WEB/MOBILE/API. 
		//As of now we have only WEB as a part of this framework. 
		public String getTestType() {
			return ProjectConfigaration.getInstance().getValue("techFynder.test.type");
		}
	
		//This method is used to get the URL of the application.
		public String getTestUrl() {
			if (getEnv().toLowerCase().startsWith("prod"))
				return ProjectConfigaration.getInstance().getValue("client.prod.url");
			else
				return ProjectConfigaration.getInstance().getValue("client.test.url");
		}
		
		//This method is used to get the environment of the application.
		public String getEnv() {
			return System.getProperty("evn", ProjectConfigaration.getInstance().getValue("techFynder.test.env"));
			//return TechFynderConfiguration.getInstance().getValue("techFynder.test.env");
		}

		//This method is used to get any property value.
		public String getProperty(String property) {
			return ProjectConfigaration.getInstance().getValue(property);
		}
}

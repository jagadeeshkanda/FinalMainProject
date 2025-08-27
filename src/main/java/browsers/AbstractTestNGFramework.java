package browsers;

import org.openqa.selenium.WebDriver;

import config.Configuration;
import seleniumOperations.seleniumToolsFactory;

public class AbstractTestNGFramework {
	public Configuration config;
	seleniumToolsFactory stf;
	private WebDriver driver;
	
	public AbstractTestNGFramework() {
		config = new Configuration();
		stf = new seleniumToolsFactory();
		driver = getDriver();	
	}

	// This method is used to get the webDriver.
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public WebDriver initBrowser(String browserName) {
		if (config.getTestType().trim().equalsIgnoreCase("WEB")) {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeBrowserDriver().getDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new MicrosoftEdgeBrowserDriver().getDriver();
			} else {
				driver = new ChromeBrowserDriver().getDriver();
			}
		}
		return driver;
	}

	// Before method to instantiate web driver and open test url.
	@SuppressWarnings("static-access")
	public void setUp(String browser) {
		String testType = config.getTestType();

		if (testType.trim().equalsIgnoreCase("WEB")) {
			stf.createInstance(browser);
			driver = stf.getInstance();
		}
	}

	public void openTestURL() throws InterruptedException {
		driver.get(config.getTestUrl());
	}

	public void openRequestedURL(String strURL) throws InterruptedException {
		driver.get(strURL);
	}

	// After method is used to close all the web driver instances which are open
	// currently.
	public void tearDown() {
		getDriver().close();
	}
}

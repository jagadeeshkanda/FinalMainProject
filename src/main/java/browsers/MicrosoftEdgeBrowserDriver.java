package browsers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MicrosoftEdgeBrowserDriver extends AbstractBrowserDriver {
	
	@Override
	public WebDriver createWebDriver() {
	    EdgeOptions options = new EdgeOptions();
	    WebDriver driver = new EdgeDriver(options);
	    driver.manage().window().maximize();
	    return driver;
	}
	/*public WebDriver createWebDriver() {
		//WebDriverManager.edgedriver().setup();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.ANY);
		
		EdgeOptions options = new EdgeOptions();
		options = options.merge(capabilities);
		
		WebDriver webDriver = new EdgeDriver(options);
		
		webDriver.manage().window().maximize();
		
		return webDriver;
	}*/

}

package browsers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowserDriver extends AbstractBrowserDriver {

	@Override
	public WebDriver createWebDriver() {
		//WebDriverManager.chromedriver().setup();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.ANY);
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options = options.merge(capabilities);
		options.addArguments("test-type","start-maximized","no-default-browser-check","--disable-extensions",
				"--disable-notifications", "--disable-popup-blocking");
		
		WebDriver webDriver = new ChromeDriver(options);
		
		webDriver.manage().window().maximize();
		
		return webDriver;
		
	}

}

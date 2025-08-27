package utilities;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	
private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driver) {
		tldriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}
	
	public static void removeDriver() {
		getDriver().quit();
		tldriver.remove();
	}

}

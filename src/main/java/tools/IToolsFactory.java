package tools;

import org.openqa.selenium.WebDriver;

public interface IToolsFactory<T> {
	public void createInstance(String browser);
	public static WebDriver getInstance() {
		return null;
	}
	public void closeInstance();
	public void killBrowserInstance();

}

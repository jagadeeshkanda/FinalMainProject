package seleniumOperations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import browsers.AbstractBrowserDriver;
import browsers.ChromeBrowserDriver;
import browsers.MicrosoftEdgeBrowserDriver;
import config.ProjectConfigaration;
import tools.IToolsFactory;

public class seleniumToolsFactory implements IToolsFactory<WebDriver> {
	ProjectConfigaration config;
	public static WebDriver webDriver;
	private static ArrayList<String> taskList = new ArrayList<String>();
	
	@SuppressWarnings("static-access")
	public seleniumToolsFactory() {
		this.config = ProjectConfigaration.getInstance();
		this.webDriver = getInstance();
	}
	
	// This method is used to get the browser driver instance
		public static WebDriver getInstance() {
			return webDriver;
		}
		
		// This method is used to create browser driver instance (Firefox/Chrome/IE)	
	@Override
	public void createInstance(String browser) {
		AbstractBrowserDriver driver = null;
		switch (browser.toUpperCase()) {
		case "CHROME":
			driver = new ChromeBrowserDriver();
			break;
		case "EDGE":
			driver = new MicrosoftEdgeBrowserDriver();
			break;
		}	
		webDriver = driver.getDriver();
		// TODO Auto-generated method stub
		
	}

	// This method is used to close the browser driver instance
		@SuppressWarnings("static-access")
		@Override
		public void closeInstance() {
			if (this.webDriver != null)
				this.webDriver.quit();
		}

		/**
		 * isProcessRunning() method tells whether the process is running or not.
		 * 
		 * @param process The name of a process.
		 * @return return true if process is running else returns false
		 */
		public static boolean isProcessRunning(String process) {
			for (int i = 0; i < taskList.size(); i++) {
				if (taskList.get(i).contains(process))
					return true;
			}
			return false;
		}
		/**
		 * This method is used to check if any browser is still running, if so then kill
		 * that process.
		 */
		@Override
		public void killBrowserInstance() {
			String line = "";
			Process process = null;

			try {
				process = Runtime.getRuntime().exec("tasklist");
				BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				while ((line = reader.readLine()) != null) {
					taskList.add(line);
				}

				if (isProcessRunning("geckodriver.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
				}
//				if (isProcessRunning("chrome.exe")) {
//					Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
//				}
				if (isProcessRunning("chromedriver.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
				}
				if (isProcessRunning("msedgedriver.exe")) {
					Runtime.getRuntime().exec("taskkill /F /IM msedgedriver.exe");
				}
			} catch (Exception e) {
			}
		}

}

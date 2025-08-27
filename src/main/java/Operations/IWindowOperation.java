package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IWindowOperation {
	//To switch the control of selenium webdriver to the last tab from the current tab.
		public void switchToLastTab();
		
		//To switch the control of selenium webdriver to the first tab from the current tab and close the current tab.
		public void switchToFirstTab();
		
		//To switch to first tab without closing current tab.
		public void switchToFirstTabWithOutClosingCurrentTab();
		
		//To close the current tab which is having focus currently.
		public void closeTab();
		
		//To wait till multiple tabs are open.
		public void waitTillMultipleTabOpens();

		void switchToSecondLastTab();
		
		//To switch the control of Selenium WebDriver to the nth last tab from the current tab
		public void switchToNthLastTab(int tabno);

		public WebElement WaitForElementToBeClickable(By webElement, long timeOutInSeconds);
}

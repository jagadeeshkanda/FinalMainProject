package Operations;

import java.util.List;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public interface IWebOperation<T, R> {
	
	// This method is used to wait for element to be returned by this method.
		public R waitForElement(T t);

		// This method is used to wait for element to be clickable by this method.
		public boolean WaitForElementToBeClickable(WebElement webElement, long timeOutInSeconds);
		
		// This method is used to move the mouse to the center of the element.
		public void moveToElement(T t);

		// This method is used to click on specified button.
		public void clickButton(T t);

		// This method is used to return boolean value true if element is present else
		// return false.
		public boolean hasElement(T t, long timeout);

		// This method is used to return boolean value true if there is no element
		// present.
		public boolean hasNoElementAsExpected(T t);

		// This method is used to return the web element which is no more present on the
		// page.
		public void waitForElementGone(T t);

		// This method is used to verify if the element is selected or not.
		public boolean verifyElementSelected(T t, boolean selected);

		// This method is used to scroll to element and click that particular element.
		public void scrollToElementAndClick(T t);

		// This method is used to get the element into viewable condition.
		public void scrollToElement(T t);

		// This method is used to get the inner text from the element.
		public String getTextFromElement(T by);
		
		// This method is used to get the inner text from the element from parent element.
		public String getTextFromElement(WebElement webElement, T by);

		// This method is used to select the radio button by value of the radio button.
		public void selectRadioButtonByValue(T t, String valueToSelect);

		// This method is used to get the total number of elements on the webpage.
		public int countElements(T t, long waitTime);

		// This method is used to send text orenter values into the textbox.
		public void sendValuesToWebElement(T t, String value);

		// This method is used to check if element is disabled within the web page.
		public boolean isDisabled(T t);

		// This method is used to check if element is enabled within the web page.
		public boolean isEnabled(T t);

		// This method is used to get the title of the currently displayed web page.
		public String getPageTitle();

		// This method is used to handle wait time.
		public void handledSleep(int sleepInSeconds);

		// This method is used to open new tab and switch to it.
		public void openNewTabAndSwitchTo(String url);

		// This method is used to verify text in the list.
		public boolean verifyTextInList(T t1, T t2, String text);

		// This method is used to clear the text of an element.
		public void clearText(T t);

		// This method is used to get the value attribute.
		String getValueFromElement(By by);
		
		// This method is used to get the value attribute from parent element.
		String getValueFromElement(WebElement webElement, By by);

		// This method is used to get the value of any attribute.
		String getValueFromElement(By by, String attribute);
		
		// This method is used to get the value of any attribute from parent element.
		String getValueFromElement(WebElement webElement, By by, String attribute);

		// This method is used to click an element using javascript executor.
		public void clickAnElementUsingJavaScriptExecutor(T t);

		// This method is used to send tab key to the given element.
		public void sendTabKey(T t);
		
		// This method is used to drag and drop an element by given x and y coordinates.
		public void dragDropBy(By by, int x, int y) ;
		
		// This method is used to move the cursor to center of an element and click.
		public void moveToElementAndClick(By by);

		// This method is used to send enter key to the given element.
		void sendEnterKey(By by);

		// This method is used to return all the elements if present.
		public List<WebElement> waitForElements(T t);

		public WebElement waitForElement(WebElement parentElement, By by);

		public List<WebElement> waitForElements(WebElement parentElement, By by);
		
		public void scrollToEndOfPage();
		
		public void scrollToPageTop();
		
		public void scrollDownBy(long pixels);
		
		public void sendValuesToWebElementAsKeys(By by, Keys keys);

		void clickAnElementUsingJavaScriptExecutor(WebElement webElement);
	}
		



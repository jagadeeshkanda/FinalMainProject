package seleniumOperations;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Operations.IFrameOperation;
import Operations.ISelectOperation;
import Operations.IWebOperation;
import Operations.IWindowOperation;

public class SeleniumBase  implements ISelectOperation<By>, IWindowOperation,
IFrameOperation<By>, IWebOperation<By, WebElement> {
	WebDriver driver;
	public String defaultCountry = "";

	public SeleniumBase(WebDriver driver) {
		this.driver = driver;
	}
	
	// This method is used to get JavaScriptExecutor object.
		public JavascriptExecutor getJavaScriptExecutor() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js;
		}

	@Override
	public void switchToFrame(By identifier) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void switchToFrameContainingText(String identifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrameByIndex(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToDefaultContext() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToLastTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFirstTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFirstTabWithOutClosingCurrentTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitTillMultipleTabOpens() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToSecondLastTab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToNthLastTab(int tabno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectItemByValue(By t, String itemToSelect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectItemByText(By t, String itemText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectItemByIndex(By t, int itemIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement waitForElement(By by) {
		// TODO Auto-generated method stub
		WebElement webElement = null;
		try {
			FluentWait<WebDriver> ft =  new FluentWait<>(this.driver);
			ft.withTimeout(Duration.ofSeconds(10));
			ft.pollingEvery(Duration.ofMillis(500));
			webElement = ft.until(new Function<WebDriver, WebElement>() {
				@Override
				public WebElement apply(WebDriver t) {
			if(t.findElements(by).size()>0) {
				return t.findElement(by);
			}
			else
				return null;
		}
	});
		}catch (Exception ie) {
			
		}
		return webElement;
	}
	@Override
	public WebElement WaitForElementToBeClickable(By webElement, long timeOutInSeconds) {
		// TODO Auto-generated method stub
		WebElement webElementClickable = null;
		try {
			WebDriverWait webDriverWait = new WebDriverWait(this.driver, Duration.ofSeconds(timeOutInSeconds));
			return webElementClickable = webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return webElementClickable;
	}

	@Override
	public void moveToElement(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickButton(By by) {
		
		try {
			waitForElement(by).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		

		
	}

	@Override
	public boolean hasElement(By by, long timeout) {
		// TODO Auto-generated method stub
		try {
			new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this.driver.findElements(by).size() != 0;
		}

	@Override
	public boolean hasNoElementAsExpected(By t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void waitForElementGone(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyElementSelected(By t, boolean selected) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void scrollToElementAndClick(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollToElement(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTextFromElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTextFromElement(WebElement webElement, By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectRadioButtonByValue(By t, String valueToSelect) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countElements(By t, long waitTime) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sendValuesToWebElement(By by, String value) {
		// TODO Auto-generated method stub
		try {
			waitForElement(by).sendKeys(value);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean isDisabled(By t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(By t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handledSleep(int sleepInSeconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openNewTabAndSwitchTo(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyTextInList(By t1, By t2, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clearText(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getValueFromElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueFromElement(WebElement webElement, By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueFromElement(By by, String attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueFromElement(WebElement webElement, By by, String attribute) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clickAnElementUsingJavaScriptExecutor(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendTabKey(By t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragDropBy(By by, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveToElementAndClick(By by) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendEnterKey(By by) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<WebElement> waitForElements(By by) {
		// TODO Auto-generated method stub
		List<WebElement> webElements = null;
		try {
			FluentWait<WebDriver> wait = new FluentWait<>(this.driver);
			wait.withTimeout(Duration.ofSeconds(3));
			wait.pollingEvery(Duration.ofSeconds(2));
			webElements = wait.until(new Function<WebDriver, List<WebElement>>() {
				@Override
				public List<WebElement> apply(WebDriver t) {
					if (t.findElements(by).size() > 0)
						return t.findElements(by);
					else
						return null;
				}
			});
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return webElements;
	}

	@Override
	public List<WebElement> waitForElements(WebElement parentElement, By by) {
		// TODO Auto-generated method stub
		List<WebElement> webElements = null;
		try {
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(3));
			webElements = wait.until(ExpectedConditions.visibilityOfAllElements(parentElement.findElements(by)));
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return webElements;	}

	@Override
	public void scrollToEndOfPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollToPageTop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scrollDownBy(long pixels) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendValuesToWebElementAsKeys(By by, Keys keys) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickAnElementUsingJavaScriptExecutor(WebElement webElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement waitForElement(WebElement parentElement, By by) {
		// TODO Auto-generated method stub
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
			webElement = wait.until(ExpectedConditions.visibilityOf(parentElement.findElement(by)));
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return webElement;
		
	}

	@Override
	public boolean WaitForElementToBeClickable(WebElement webElement, long timeOutInSeconds) {
		// TODO Auto-generated method stub
		return false;
	}

	

}

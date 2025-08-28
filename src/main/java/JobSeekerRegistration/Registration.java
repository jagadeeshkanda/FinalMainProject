package JobSeekerRegistration;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumOperations.SeleniumBase;

public class Registration extends SeleniumBase {
	private Elements elements;
	WebDriver driver;

	public Registration(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.elements = new Elements();
		PageFactory.initElements(this.driver, this.elements);
	}
		private static class Elements{
			By JobFynder = By.xpath("//nav//a[@routerlink='/job-search']");
			By ForJobSeeker = By.xpath("//button//span[contains(text(),'For Jobseeker')]");
			By Register = By.xpath("(//a//span[@class='mat-button-wrapper'])[2]");	
			By UploadCV = By.xpath("//button[@class='upload_cvnow']");
			By FirstName = By.xpath("//input[@name='firstName']");	
			}
		
		public void ClickJobFynder() {
			clickButton(this.elements.JobFynder);
		}
		
		public boolean isForJobseeker() {
			try {
				if (hasElement(this.elements.ForJobSeeker, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public void ClickForJobseeker() {
			clickButton(this.elements.ForJobSeeker);
		}
		
		public boolean isRegister() {
			try {
				if (hasElement(this.elements.Register, 10)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public void ClickRegister() {
			clickButton(this.elements.Register);
		}
		
		public boolean UploadCV() {
			try {
				if (hasElement(this.elements.UploadCV, 10)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public void sendvalueFirstName() {
			sendValuesToWebElement(this.elements.FirstName,"Jagadeesh");
		}
		
		
	
}

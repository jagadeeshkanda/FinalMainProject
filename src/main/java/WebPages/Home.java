package WebPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import seleniumOperations.SeleniumBase;
import org.openqa.selenium.By;

public class Home extends SeleniumBase {
	private Elements elements;
	WebDriver driver;

	public Home(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.elements = new Elements();
		PageFactory.initElements(this.driver, this.elements);
		// TODO Auto-generated constructor stub
	}
		private static class Elements {
			By JobFynder = By.xpath("//nav//a[@routerlink='/job-search']");
			By Talentfynder = By.xpath("//nav//a[@routerlink='/talent-search']");
			By InternShipfynder = By.xpath("//nav//a[@routerlink='/internship-fynder']");
			By Studyfynder = By.xpath("//nav//a[@routerlink='/study-fynder']");
			By Skillfynder = By.xpath("//nav//a[@routerlink='/skillfynder-search']");
			
			

		}
		
		public boolean isJobSeekerDisplayed() {
			try {
				if (hasElement(this.elements.JobFynder, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public boolean isTalentFynderDisplayed() {
			try {
				if (hasElement(this.elements.Talentfynder, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public boolean isInternShipFynderDisplayed() {
			try {
				if (hasElement(this.elements.InternShipfynder, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public boolean isStudyFynderDisplayed() {
			try {
				if (hasElement(this.elements.Studyfynder, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
		
		public boolean isSkillFynderDisplayed() {
			try {
				if (hasElement(this.elements.Skillfynder, 5)) {
					return true;
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return false;
		}
	}



package browsers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

public abstract class AbstractBrowserDriver {
	private MutableCapabilities capabilities = null;
	WebDriver driver;
	
    public AbstractBrowserDriver() {
    	setDriver();
    }
    
    public void setDriver() {
    	this.driver = createWebDriver();
    }
    
    public WebDriver getDriver() {
    	return this.driver ;
    }
    
    public abstract WebDriver createWebDriver();
    
    public MutableCapabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(MutableCapabilities capabilities) {
        this.capabilities = capabilities;
    }
}

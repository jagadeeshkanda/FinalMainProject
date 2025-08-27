package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.testng.annotations.AfterSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import seleniumOperations.seleniumToolsFactory;

public class Hooks extends BaseTest {
	
	@Before
	public void beforeScenario() {
		// TO DO
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				String imagePath = "C:\\drivers\\fullPageScreenshot.png";
				Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(getDriver());
				ImageIO.write(s.getImage(),"PNG",new File(imagePath));
				Path path = Paths.get(imagePath);
				byte[] bytes = Files.readAllBytes(path);
				scenario.attach(bytes, "image/png", "Screenshot attached");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (getDriver()!=null)
			getDriver().quit();
//		new AbstractTestNGFramework().tearDown();
//		new SeleniumToolsFactory().killBrowserInstance();
	}
	
	@AfterSuite
	public void killProcess() {
		new seleniumToolsFactory().killBrowserInstance();
	}

}

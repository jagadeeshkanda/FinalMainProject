package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	 private static ExtentReports extent;

	 public static ExtentReports getInstance() {
	        if (extent == null) {
	            ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
	            spark.config().setTheme(Theme.DARK);
	            spark.config().setDocumentTitle("Automation Report");
	            spark.config().setReportName("FinalMainProject Test Results");

	            extent = new ExtentReports();
	            extent.attachReporter(spark);

	            extent.setSystemInfo("OS", System.getProperty("os.name"));
	            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
	            extent.setSystemInfo("Browser", "Chrome");
	        }
	        return extent;
	    }

}
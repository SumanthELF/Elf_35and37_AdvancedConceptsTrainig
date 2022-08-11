package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Base_Test {

	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void Browser_Setup() throws IOException {
//		String browserName = System.getProperty("browserName");
		String browserName = "chrome";
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod(alwaysRun = true)
	public void Browser_tear_down(ITestResult result) throws InterruptedException {

		Reporter.log("Close", true);
		driver.quit();
	}
}

package TestCases;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
	
	@BeforeSuite
	public void StartDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	
	@AfterSuite
	public void StopDriver() {
		driver.quit();
	}
	@AfterMethod
	public void TakeScreenShot(ITestResult result) {
			if (ITestResult.FAILURE==result.getStatus()) {
				System.out.println("Failed");
				System.out.println("Taking .. ScreenShot");
				Helper.CaptureScreenShot(driver, result.getName());
			}
		}

}

package testNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sampleTestCase {
	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public void OpenLeafGround() {
		driver.navigate().to("http://www.leafground.com/");
		System.out.println("Leafground Opened");
	}

	@Test(priority = 1)
	public void OpenW3Schools() {
		driver.navigate().to("https://www.w3schools.com/");
		System.out.println("W3schools Opened");
	}

	@Test(priority = 2)
	public void OpenGoogle() {
		driver.navigate().to("https://www.google.com/");
		System.out.println("Google Opened");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("Total Time= " + totalTime);
	}
}

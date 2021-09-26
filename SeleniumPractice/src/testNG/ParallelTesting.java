package testNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ParallelTesting {
	@Test(priority = 0)
	public void openGoogle() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Parallel Google Opened");
		driver.quit();

	}

	@Test(priority = 1)
	public void openBing() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		System.out.println("Parallel Bing Opened");
		driver.quit();

	}
}

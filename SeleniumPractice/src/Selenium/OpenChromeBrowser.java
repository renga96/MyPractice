package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\google.com");
		driver.findElement(By.className("gb_g")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Sign in")).sendKeys(Keys.ENTER);
		//driver.quit();
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGmailLink {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
//Since gmail sign in is opening in new page cannot open Gmail link in google gome page
//driver.findElement(By.className("gb_g")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("gb_70")).sendKeys(Keys.ENTER);
		WebElement userName = driver.findElement(By.id("identifierId"));
		userName.sendKeys("renga0807");
		

	}

}

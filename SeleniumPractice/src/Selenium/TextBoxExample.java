package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();

	
	WebElement email = driver.findElement(By.id("email"));
	Thread.sleep(2000);
	email.sendKeys("testleaf@gmail.com");
				  
				  
	WebElement appendText =	driver.findElement(By.xpath("//input[@value='Append ']"));
	Thread.sleep(2000);
	appendText.sendKeys("Added Text");
				  
				  
	String value = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value"); 
	System.out.println(value);
	
		
	
	}

}

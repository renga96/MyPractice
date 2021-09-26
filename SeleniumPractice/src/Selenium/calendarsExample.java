package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarsExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calenders= driver.findElement(By.id("datepicker"));
		//calenders.sendKeys("11/10/2020"+Keys.ENTER);
		
		calenders.click();
		
		WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		WebElement nextButton1=driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton1.click();
		
		WebElement date =driver.findElement(By.linkText("10"));
		date.click();

	}

}

package Selenium;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		
		
		WebElement alert1= driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alert1.click();
		
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(1000);
		a1.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		alert2.click();
		Thread.sleep(1000);
		a1.dismiss();	
		
		WebElement alert3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		alert3.click();
		Thread.sleep(500);
		a1.sendKeys("Great Learning");
		Thread.sleep(500);
		a1.accept();
		
		/*
		 * WebElement alert4=
		 * driver.findElement(By.xpath("//button[text()='Sweet Alert']"));
		 * alert4.click(); Thread.sleep(500); a1.
		 */
	}

}

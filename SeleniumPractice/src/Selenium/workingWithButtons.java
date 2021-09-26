package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class workingWithButtons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		
//1.Getting Position of the Second Button
		WebElement getposition= driver.findElement(By.id("position"));
		org.openqa.selenium.Point xy= getposition.getLocation();
		int x=xy.getX();
		int y=xy.getY();
		
		System.out.println("The Value of X is "+ x);
		System.out.println("The Value of Y is "+ y);
	
//2.Getting color Of the Third Button
		WebElement getcolor= driver.findElement(By.id("color"));
		String color= getcolor.getCssValue("background-color");
		System.out.println("The Color Of the Button is "+ color);
	
		/*
		 * String hex = String.format("#%02x%02x%02x", 144,238,144);
		 * System.out.println("The Color is "+hex);
		 * 
		 * Color colour = Color.fromString(hex);
		 * System.out.println("The Color is "+colour);
		 */
		
		
//3.Getting the Height and Width of Button
		
		WebElement getsize= driver.findElement(By.id("size"));
		int height= getsize.getSize().getHeight();
		int width= getsize.getSize().getWidth();
		System.out.println("The Height Of the Button is "+ height);
		System.out.println("The Width Of the Button is "+ width);
		
//4.Going to home Page By Clicking
		WebElement home= driver.findElement(By.id("home"));
		Thread.sleep(1000);
		home.click();
		
	
	}

}

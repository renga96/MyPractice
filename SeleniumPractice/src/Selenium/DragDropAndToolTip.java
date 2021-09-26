package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAndToolTip {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='drop']")).click();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		
//2.Working with Tooltip
	driver.get("http://www.leafground.com/pages/tooltip.html");	
	
	WebElement textbox= driver.findElement(By.id("age"));
	String txt= textbox.getAttribute("title");
	System.out.println(txt);
	
	
		
	}

}

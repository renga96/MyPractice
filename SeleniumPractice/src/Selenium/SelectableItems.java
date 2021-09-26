package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableItems {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='selectable']")).click();
				
		  List<WebElement> items= driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		  
		  int totalItems= items.size();
		  System.out.println(totalItems);
		  
		  Actions act =new Actions(driver);
			
			  act.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(2)).click(items.get(4)); 
			  act.build().perform();
			 
		  
			/*
			 * act.keyUp(Keys.CONTROL).click(items.get(4)).click(items.get(2));
			 * act.build().perform();
			 */
			/*
			 * Actions act = new Actions(driver); act.clickAndHold(items.get(0));
			 * act.clickAndHold(items.get(6)); act.clickAndHold(items.get(2));
			 * act.build().perform();
			 */
		
	
	}

}

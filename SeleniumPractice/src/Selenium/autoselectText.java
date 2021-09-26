package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoselectText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Auto Complete']")).click();

		
		WebElement courseName =driver.findElement(By.id("tags"));
		courseName.sendKeys("S");
		
		Thread.sleep(3000);
		List<WebElement> totalOptions= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int size=totalOptions.size();
		System.out.println(size);
		
		
		  for (WebElement v1 : totalOptions)
		  { 
			  if(v1.getText().equals("SOAP"))
			  {
				  v1.click(); 
				  break;
			  }
		  }
		 
		/*
		 * Actions act = new Actions(driver);
		 * act.keyDown(Keys.ARROW_DOWN).click(totalOptions.get(1));
		 * act.build().perform();
		 */
	}

}

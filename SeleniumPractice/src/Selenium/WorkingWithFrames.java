package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Frame']")).click();
		
//*Clicking Button Inside Frame
		driver.switchTo().frame(0); 
		WebElement frame1= driver.findElement(By.id("Click"));
		Thread.sleep(500);
		frame1.click();

		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
//*Moving to Frame 1 in the Nested Frame		
		driver.switchTo().frame(1);
//*Moving to nested frame inside the Main Frame 1 Hence giving the frame value as 0 
//*since its present inside the frame 1
		driver.switchTo().frame(0);
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
	
		driver.switchTo().defaultContent();
		
//*Finding No Of Frames
		
		List<WebElement>frame3 = driver.findElements(By.tagName("iframe"));
		int size = frame3.size();
		System.out.println(size);



	}

}

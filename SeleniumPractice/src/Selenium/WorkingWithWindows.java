package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Windows']")).click();
		
		//*Getting the Home Window handle and Store it in OldWindow
		String OldWindow= driver.getWindowHandle();
		
		//*Clicking the Windows Home Button
		WebElement Button1= driver.findElement(By.id("home"));
		Button1.click();
		
		//*Storing the No.of Windows Available in Handles Variable(as of now 2 windows shd Open)
		Set<String> Handles=driver.getWindowHandles();
		
		for (String newWindow : Handles) 
		{
			driver.switchTo().window(newWindow);
		}
		//*finding RadioButton icon and Clicking it
		WebElement radio= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img"));
		Thread.sleep(500);
		radio.click();
		Thread.sleep(500);
		//*Finding the Button Yes and Clicking it
		driver.findElement(By.xpath("//*[@id=\'yes\']")).click();
		Thread.sleep(500);
		driver.close();
		
		driver.switchTo().window(OldWindow);
		
		WebElement Multi=driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		Multi.click();
		
		int number=	driver.getWindowHandles().size();
		System.out.println(number);
		
		WebElement close = driver.findElement(By.xpath("//button[@id='color']"));
		Thread.sleep(500);
		close.click();
		Set<String> C1=driver.getWindowHandles();
		for (String N1 : C1) 
		{
			if(!N1.equals(OldWindow))
			{
				driver.switchTo().window(N1);
				Thread.sleep(500);
				driver.close();
			}
		}
		driver.quit();		
	}

}

package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFiles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='Download']")).click();

		WebElement excel = driver.findElement(By.linkText("Download Excel"));
		WebElement pdf = driver.findElement(By.linkText("Download PDF"));
		WebElement text = driver.findElement(By.linkText("Download Text"));

      excel.click();
	  Thread.sleep(2000);
	  text.click(); 
	 // Thread.sleep(2000);	  
	 // pdf.click();
		 
		Thread.sleep(3000);

		File location = new File("C:\\Users\\santhanam\\Downloads");

		File[] dowloadedFile = location.listFiles();

		for (File files : dowloadedFile) 
		{
			if (files.getName().equals("testleaf.xlsx")) 
			{
				System.out.println("Excel File is Downloaded");
				break;
			} 
			else if (files.getName().equals("testleaf.pdf")) 
			{
				System.out.println("PDF File is Downloaded");
				break;
			}
			else if (files.getName().equals("testleaf.txt")) 
			{
				System.out.println("TXT File is Downloaded");
				break;
			}
		}
	}
}


package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		
		WebElement d1 =driver.findElement(By.id("dropdown1"));
		Select s1 = new Select(d1);
		s1.selectByIndex(1);
		
		
		WebElement d2= driver.findElement(By.name("dropdown2"));
		Select s2= new Select(d2);
		s2.selectByVisibleText("Appium");
		 
		
		WebElement d3= driver.findElement(By.id("dropdown3"));
		Select s3= new Select(d3);
		s3.selectByValue("4");
		
		WebElement d4= driver.findElement(By.className("dropdown"));
		Select s4 = new Select(d4);
		List<WebElement> list= s4.getOptions();
		int l1= list.size();
		System.out.println("The Size Of DropDown is "+l1);
		
		WebElement d5= driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]"));
		d5.sendKeys("UFT/QTP");
		
		WebElement d6= driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
		Select s5 =new Select(d6);
		s5.selectByIndex(1);
		s5.selectByIndex(3);
		s5.selectByIndex(4);
		
	}

}

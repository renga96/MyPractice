package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[text()='Radio Button']")).click();
//1.Radio Button Example
		//*Are you enjoying the classes?		
		WebElement R1=driver.findElement(By.id("no"));
		Thread.sleep(1000);
		R1.click();
		
		//*Find default selected radio button
		WebElement R2=driver.findElement(By.xpath("//input[@name='news']"));
		boolean s1= R2.isSelected();
		WebElement R3= driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean s2= R3.isSelected();
		System.out.println("Default Selected Unchecked?" +s1);
		System.out.println("Default Selected checked?" + s2);
		//*Selecting Age Group Below 20
		WebElement r4=driver.findElement(By.xpath("//input[@name='age']"));
		Thread.sleep(1000);
		r4.click();
		Thread.sleep(1000);
	
//2.Check Box
		driver.get("http://www.leafground.com/pages/checkbox.html");
	//*Selecting the known Language
	WebElement C1=driver.findElement(By.xpath("//input[@type='checkbox']"));
	WebElement C2=driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[1]/div[5]/input[1]"));
	C1.click();
	Thread.sleep(300);
	C2.click();
	
	//*Checking Whether the CB is selected
	WebElement C3= driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input"));
	boolean s3=C3.isSelected();
	System.out.println("Is CheckBox Selected "+s3);
	
	//*Deselecting the Selected CB
	WebElement C4=driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input"));
	WebElement C5=driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]"));
	
	if(C4.isSelected())
	{
	Thread.sleep(300);
	C4.click();	
	}
	else
	{
	Thread.sleep(300);
	C5.click();
	}
	
	
	}
	
	
	}



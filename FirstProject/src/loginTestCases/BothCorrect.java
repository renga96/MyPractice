package loginTestCases;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BothCorrect {
	
	String [][]data = 
		{
				{"Admin","admin123"},
				{"Username","Password"},
				{"Username","admin123"},
				{"Admin","Admin"}
		};
	
	@DataProvider(name="LoginData")
	public String[][] dataProvider()
	{
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void loginWithbothCorrect(String uName,String pWord) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys(uName);

		WebElement passWord = driver.findElement(By.id("txtPassword"));
		passWord.sendKeys(pWord);

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();

		driver.quit();
	}
}

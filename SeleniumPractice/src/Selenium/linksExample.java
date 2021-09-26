package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		// Clicking the Home Button
		WebElement homeButton = driver.findElement(By.linkText("Go to Home Page"));
		homeButton.click();
		Thread.sleep(1000);

		// Returning back to original page
		driver.navigate().back();

		// Finding Where it will go without Clicking Elememt
		WebElement whereItsGoing = driver.findElement(By.partialLinkText("Find where am supposed"));
		String destinationLink = whereItsGoing.getAttribute("href");
		System.out.println("Destination Link =" + destinationLink);

		// Verifying the Link is Broken
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();

		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The Link is Broken");
		} else {
			System.out.println("The Link is Not Broke");
		}
		driver.navigate().back();

		WebElement homePage = driver.findElement(By.linkText("Go to Home Page"));
		homePage.click();

		driver.navigate().back();

		List<WebElement> noOfElements = driver.findElements(By.tagName("a"));

		int totalLinks = noOfElements.size();

		System.out.println("No Of Links in Page=" + totalLinks);

	}

}

package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(priority=0,groups={"Apple"})
	public void firstApple()
	{
		System.out.println("First Apple");
	}
	@Test(priority=1,groups={"Apple"})
	public void secondApple()
	{
		System.out.println("Second Apple");
	}
	
	@Test(priority=2,groups={"Android"})
	public void firstAndroid()
	{
		System.out.println("First Android");
	}
	@Test(priority=3,groups={"Android"})
	public void secondAndroid()
	{
		System.out.println("Second Android");
	}
	
	@Test(priority=4,groups={"BlackBerry"})
	public void firstBlackBerry()
	{
		System.out.println("First BlackBerry");
	}
	@Test(priority=5,groups={"BlackBerry"})
	public void secondBlackBerry()
	{
		System.out.println("Second BlackBerry");
	}
}

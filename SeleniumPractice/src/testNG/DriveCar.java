package testNG;

import org.testng.annotations.Test;

public class DriveCar {

	@Test(priority=0)
	public void startTheCar() 
	{
		System.out.println("Car is Started");
	}
	@Test(priority=1)
	public void putFirstGear() 
	{
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear() 
	{
		System.out.println("Second Gear");
	}
}

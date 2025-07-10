package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//assert the text --> Time at Work
		String actualValue = driver.findElement(By.xpath("//p[contains(normalize-space(),'at Work')]")).getText();
		Assert.assertEquals(actualValue, "Time at Work");
	}
	
	@Test
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//assert the text --> Invalid credentials
		String actualError=driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		
		Assert.assertTrue(actualError.contains("Invalid credential")); //expect true
	}
	
	
	
}



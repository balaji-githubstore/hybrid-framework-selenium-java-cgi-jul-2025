package com.cgi.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

	@Test
	public void titleTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}
	
	@Test
	public void headerTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Assert the header - Login
		String actualHeader= driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}
}





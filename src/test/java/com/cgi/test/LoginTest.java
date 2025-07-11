package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		String actualValue = dashboard.getTimeAtWorkText();
		Assert.assertEquals(actualValue, "Time at Work");
	}
	
	//create a dataprovider wih name - invalidLoginData
//	saul,saul123,Invalid credential
//	kim,kim123,Invalid credential

	@Test
	public void invalidLoginTest(String username,String password,String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertTrue(actualError.contains(expectedError)); // expect true
	}

}

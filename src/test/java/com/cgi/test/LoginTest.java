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

	@Test
	public void invalidLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("john");
		login.enterPassword("admin123");
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertTrue(actualError.contains("Invalid credential")); // expect true
	}

}

package com.cgi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataSource;

public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataSource.class, dataProvider = "commonDataProvider",groups = {"login","smoke"})
	public void validLoginTest(String username,String password,String expectedValue) {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		DashboardPage dashboard = new DashboardPage(driver);
		String actualValue = dashboard.getTimeAtWorkText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Test(dataProviderClass = DataSource.class, dataProvider = "commonDataProvider",groups = {"login","regression"})
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLogin();

		String actualError = login.getInvalidErrorMessage();
		Assert.assertTrue(actualError.contains(expectedError)); // expect true
	}

}

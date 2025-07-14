package com.cgi.test;

import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataSource;

public class EmployeeTest extends AutomationWrapper{
	
	@Test(dataProviderClass = DataSource.class, dataProvider = "commonDataProvider")
	public void addValidEmployeeTest(String username,String password,String firstname,String middlename,String lastname,String expectedProfileName)
	{
		LoginPage login = new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		login.clickOnLogin();
		
		//click on PIM menu
		//enter firstname,middlename,lastname
		//click on save
		//Assert the profile name
	}

}

package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Will be deleted
 */
public class ZDemo1Test  {
	
	
	@DataProvider
	public Object[][] validData()
	{
		Object[][] data=new Object[3][2]; 
		//i--> number of testcase
		//j --> number of parameters 
		data[0][0]="peter";
		data[0][1]="peter123";
		
		data[1][0]="john";
		data[1][1]="john123";
		
		data[2][0]="kinh";
		data[2][1]="kim123";
		
		return data;
		
	}
	
	
	@Test(dataProvider = "validData")
	public void validTest(String username,String password)
	{
		System.out.println("valid test"+username+password);
	}
	

}

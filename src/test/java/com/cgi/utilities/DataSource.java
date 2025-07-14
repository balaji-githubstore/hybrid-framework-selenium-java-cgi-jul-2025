package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSource {

	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "saul";
		data[0][1] = "saul123";
		data[0][2] = "Invalid credential";

		data[1][0] = "peter";
		data[1][1] = "peter";
		data[1][2] = "Invalid credential";

		return data;
	}

//	public Object[][] invalidLogin1Data() {
//		Object[][] data = { { "peter", "peter123" }, { "john", "john123" }, { "9", "kim123" } };
//		return data;
//	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//Current @Test method name is the sheet name
		String testMethodName=method.getName();
		Object[][] data= ExcelSource.getSheetIntoTwoDimensionalArray("test-data/OrangeData.xlsx", testMethodName);
		return data;
	}
}

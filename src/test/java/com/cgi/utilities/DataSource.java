package com.cgi.utilities;

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
}

package com.cgi.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ZDemoExtentReport {

	public static void main(String[] args) {
	
		//only once in the beginning - configuration details
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		
		//run before each @Test or Scenario to create a test method in report 
		ExtentTest test= extent.createTest("MyFirstTest-CGI");
		
		
		//run after each @Test or Scenario to log the status of created test method 
		test.log(Status.FAIL, "This is a logging event for MyFirstTest, and it passed!");
		
		
		
		
		//runs at the end to generate the report
		extent.flush();

	}

}

package com.cgi.test;

import org.testng.annotations.Test;

/**
 * Will be deleted
 */
public class ZDemo1Test  {
	
	
	
	public String[][] validData()
	{
		String[][] arr3={{"peter","peter123"},{"john","john123"},{"9","kim123"}};
		return arr3;
	}
	
	
	@Test
	public void validTest(String username,String password)
	{
		System.out.println("valid test"+username+password);
	}
	

}

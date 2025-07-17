package com.cgi.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {

	private final WebDriver driver;

	public WebDriverKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnElement(By locator) {
		driver.findElement(locator).click();
	}

	public void sendTextToElement(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getTextFromElement(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String getAttributeValueFromElement(By locator,String attributeName) {
		return driver.findElement(locator).getAttribute(attributeName);
	}
}

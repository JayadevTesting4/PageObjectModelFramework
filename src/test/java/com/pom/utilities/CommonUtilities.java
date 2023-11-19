package com.pom.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommonUtilities {
	public WebDriver driver;

	public CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}

	public void navigate(String url) {
		driver.get(url);
	}
	/**
	 * <p>Clicks on provided WebElement</p>
	 */
	public void clickElement(By locatorType) {
		driver.findElement(locatorType).click();
	}
	/**
	 * <p>Sends Keystrokes to provided WebElement</p>
	 */
	public void type(By locatorType, String value) {
		driver.findElement(locatorType).sendKeys(value);
	}

}
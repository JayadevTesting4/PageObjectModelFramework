package com.pom.pages;

//logintest.java- LoginPage.java(CommonUtilities.java & config.properties) , 
//				  config.properties ,
//				  Hook.java(config.properties) &
//				  TestEventListener.java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.utilities.CommonUtilities;


public class LoginPage extends CommonUtilities{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public By userIdTextBox = By.name("uid");
	public By passwordTextBox = By.name("password");
	public By loginButton = By.name("btnLogin");
	public By postLoginTextContent = By.xpath("//a[text()='New Customer']");

	public void loginIntoApp(String url, String userId, String password) {
		navigate(url);
		waitForElementToBeVisible(userIdTextBox);
		type(userIdTextBox, userId);
		waitForElementToBeVisible(passwordTextBox);
		type(passwordTextBox, password);
		waitForElementToBeClickable(loginButton);
		clickElement(loginButton);
		validateForEquality(getElementTextContent(postLoginTextContent), "New Customer");
	}
}
package com.pom.tests;

import org.testng.annotations.Test;

import com.pom.pages.LoginPage;
import com.pom.utilities.Hooks;

public class LoginTest extends Hooks{

	@Test
	public void loginTestWithValidCredentials() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.loginIntoApp("https://demo.guru99.com/v2/","mngr533371", "rapAgYs");
		Thread.sleep(2000);
	}
}
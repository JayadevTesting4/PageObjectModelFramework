package com.pom.tests;

//logintest.java- LoginPage.java(CommonUtilities.java & config.properties) , 
//				  config.properties ,
//				  Hook.java(config.properties) &
//				  TestEventListener.java


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.pages.LoginPage;
import com.pom.utilities.CommonUtilities;
import com.pom.utilities.Hooks;

public class LoginTest extends Hooks{

	@Test(dataProvider = "login_data_provider")
	public void loginTestWithValidCredentials(String url, String username, String password) throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.loginIntoApp(url,username,password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "login_data_provider")
	public Object[][] getTestData() {
		return CommonUtilities.readExcel();
	}

}
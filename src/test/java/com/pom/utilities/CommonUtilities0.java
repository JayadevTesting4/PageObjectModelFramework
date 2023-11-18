package com.pom.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class CommonUtilities0 {

	public Properties configData;
	public WebDriver driver;

	public void readConfig() {
		try {
			FileInputStream fis = new FileInputStream(new File("./src/test/resources/config.properties"));
			configData = new Properties();
			configData.load(fis);
			System.out.println(configData.getProperty("browser.name"));
		} catch (IOException e) {
			System.out.println("Unable to Read config "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		CommonUtilities comm = new CommonUtilities();
		comm.readConfig();
		
	}
}
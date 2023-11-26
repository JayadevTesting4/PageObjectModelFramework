package com.pom.testlistenerORreporting;

//logintest.java- LoginPage.java(CommonUtilities.java & config.properties) , 
//				  config.properties ,
//				  Hook.java(config.properties) &
//				  TestEventListener.java


import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pom.utilities.CommonUtilities;

public class TestEventListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		CommonUtilities.captureScreenshot();	
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
	}
}
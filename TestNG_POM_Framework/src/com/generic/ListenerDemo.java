package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.runner.ListnerRunner;

public class ListenerDemo implements ITestListener
{
  public WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test step passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		ListnerRunner r = new ListnerRunner();
		System.out.println(r);
		try {
			TakeScreenShot.GetPhoto(r.driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test step failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test step skipped");
	}
	
	

}

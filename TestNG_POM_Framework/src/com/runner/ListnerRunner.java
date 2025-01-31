package com.runner;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.TakeScreenShot;

public class ListnerRunner
{
	public WebDriver driver;
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		driver = new ChromeDriver();
		driver.close();
	}
	
	@Test(dependsOnMethods="launchBrowser")
	public void launchApplication() 
	{
	System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	fail();
	driver.close();	
	}
	
	@Test(dependsOnMethods="launchApplication")
	public void launch() 
	{
	System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();	
	}

}

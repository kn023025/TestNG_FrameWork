package com.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG_Insta 
{
	public WebDriver driver;
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	@BeforeMethod
	public void SetUrl()
	{
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void LogOut() throws IOException
	{
		driver.close();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
	}

}

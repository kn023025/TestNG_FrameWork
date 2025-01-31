package com.PN.endUser.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript1 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApplication()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	
	@AfterMethod
	public void CloseApplication()
	{
		driver.close();
	}

}

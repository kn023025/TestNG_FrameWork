package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class InstaLogin_ExtentReport 
{
	public WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		driver = new ChromeDriver();
		
		ExtentReports rep = new ExtentReports("./report/ex2.html",false);
		ExtentTest test = rep.startTest("LoginReport");
		test.log(LogStatus.PASS, "browser launched");
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.PASS, "application launched");
		
		driver.findElement(By.name("username")).sendKeys("kavitha.narendra2704@gmail.com");
		test.log(LogStatus.PASS, "username entered successfully");
		
		driver.findElement(By.name("password")).sendKeys("Rajakumara2704@");
		test.log(LogStatus.PASS, "password enterd successfully");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(LogStatus.PASS, "login successful");
		
		rep.endTest(test);
		rep.flush();
		
	}
	
	@Test
	public void loginfail()
	{
        System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		
		ExtentReports rep = new ExtentReports("./report/ex2.html",false);
		ExtentTest test = rep.startTest("LoginReport2");
		
		driver = new ChromeDriver();
		test.log(LogStatus.FAIL, "browser did not launch");
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.FAIL, "application did not launch");
		
		driver.findElement(By.name("username")).sendKeys("kavitha.narendra2704@gmail.com");
		test.log(LogStatus.FAIL, "username not entered");
		
		driver.findElement(By.name("password")).sendKeys("Rajakumara2704@");
		test.log(LogStatus.FAIL, "password not entered");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		test.log(LogStatus.FAIL, "login failed");
		rep.endTest(test);
		rep.flush();
	}

}

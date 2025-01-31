package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec 
{
	
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./sw/geckodriver.exe");
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.get("https://www.instagram.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("kavitha.narendra2704@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Pranavi0704@");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.quit();
		}
		else
		{
			driver = new FirefoxDriver();
			driver.get("https://www.instagram.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("kavitha.narendra2704@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Pranavi0704@");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.quit();
		}
	}

}

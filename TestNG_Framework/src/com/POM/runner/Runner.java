package com.POM.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.POM.generic.PomScript1;

public class Runner 
{
	@Test
	public void data()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		PomScript1 p = new PomScript1(driver);
		p.passData();
		driver.navigate().refresh();
		p.passData();
	}
}

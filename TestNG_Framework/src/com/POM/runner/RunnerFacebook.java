package com.POM.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.POM.generic.POMFacebook;


public class RunnerFacebook 
{
	@Test
	public void data()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		POMFacebook p = new POMFacebook(driver);
		p.username("test@gmail.com");
		p.password("123@1234r");
		p.login();
		driver.quit();
	}

}

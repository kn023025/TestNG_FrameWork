package com.POM.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.POM.generic.POMInsta;
import com.POM.generic.POMSearchInsta;

public class RunnerInsta 
{
	@Test
	public void data()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		POMInsta p = new POMInsta(driver);
		p.username("kavitha.narendra2704@gmail.com");
		p.password("Pranavi0704@");
		p.login();
		
		POMSearchInsta ps = new POMSearchInsta(driver);
		ps.searchClick();
		ps.SearchPassData("Dr Rajkumar");
		ps.searchResultClick();
		ps.followClick();
		driver.quit();
	}

}

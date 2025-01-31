package com.PN.endUser.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GenericSript2 
{
	public WebDriver driver;
	
	
	@BeforeClass
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void Login()
	{
        driver.findElement(By.name("username")).sendKeys("kavitha.narendra2704@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Rajakumara2704@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterMethod
	public void GetPhoto() throws IOException
	{
		GenericTakeScreenShot.GetPhoto(driver);
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
	}
	
	@AfterClass
	public void Logout()
	{
		driver.close();
	}
	
}

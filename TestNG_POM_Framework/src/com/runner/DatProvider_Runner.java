package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatProvider_Runner
{
	@Test(dataProvider="testdata", dataProviderClass=DataProviderClass.class)
	public void ValidateForm(String required, String pwd, String cpwd, String email, String url, String digits,
			String number, String alphanum, String minLength, String maxLength,
			String rangeLength, String minValue, String maxValue,String rangeValue)
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("requiredfield")).sendKeys(required);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("confirmpass")).sendKeys(cpwd);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("url")).sendKeys(url);
		driver.findElement(By.name("digits")).sendKeys(digits);
		driver.findElement(By.name("number")).sendKeys(number);
		driver.findElement(By.name("alphanum")).sendKeys(alphanum);
		driver.findElement(By.name("minLength")).sendKeys(minLength);
		driver.findElement(By.name("maxLength")).sendKeys(maxLength);
		driver.findElement(By.name("rangeLength")).sendKeys(rangeLength);
		driver.findElement(By.name("minValue")).sendKeys(minValue);
		driver.findElement(By.name("maxValue")).sendKeys(maxValue);
		driver.findElement(By.name("rangeValue")).sendKeys(rangeValue);
		driver.close();
	}

}

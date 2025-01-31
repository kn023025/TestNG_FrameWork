package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.PropFiles_Google;

public class Runner_PropFile 
{
	
	@Test
	public void launchGoogle() throws FileNotFoundException, IOException 
	{
		String key = PropFiles_Google.testDataKey();
		String value = PropFiles_Google.testDataValue();
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		PropFiles_Google p = new PropFiles_Google();
//		String url = p.testData();
		
		String url = PropFiles_Google.testBaseUrl();
		driver.get(url);
	}

}

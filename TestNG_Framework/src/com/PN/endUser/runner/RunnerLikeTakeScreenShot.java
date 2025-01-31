package com.PN.endUser.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PN.endUser.generic.GenericSript2;

class RunnerLikeTakeScreenShot extends GenericSript2
{

	@Test
	public void likeCelebrity() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Dr Rajkumar");
		driver.findElement(By.xpath("//span[text()='drrajsongs']")).click();
		driver.findElement(By.xpath("//div[text()='Follow']")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Following']")));		
	}
	
	@Test
	public void likePolitician()
	{
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("modi");
		driver.findElement(By.xpath("//span[text()='narendramodi']")).click();
		driver.findElement(By.xpath("//div[text()='Follow']")).click();	
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Following']")));		
	}


	
}

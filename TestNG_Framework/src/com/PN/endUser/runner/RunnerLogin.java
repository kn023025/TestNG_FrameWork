package com.PN.endUser.runner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.PN.endUser.generic.GenericScript1;

public class RunnerLogin extends GenericScript1
{
	@Test
	public void action()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kavitha@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1334");
		driver.findElement(By.xpath("//button[@name='login']")).click();	
	}
	
	

}

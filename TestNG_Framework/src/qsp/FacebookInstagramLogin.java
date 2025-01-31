package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookInstagramLogin 
{
	
	@Test
	public static void facebook() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kavitha@gmail.com");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1334");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		
//		
//		System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isEnabled());
		
	}
	
	@Test
	public static void instagram() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Kavitha");
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234678967");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

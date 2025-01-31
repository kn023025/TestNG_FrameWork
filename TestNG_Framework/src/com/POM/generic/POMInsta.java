package com.POM.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMInsta 
{
	@FindBy(name="username") private WebElement username;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	
	public POMInsta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void username(String un)
	{
		username.sendKeys(un);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login()
	{
		loginBtn.click();
	}	

}

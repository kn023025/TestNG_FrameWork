package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BasePage;

public class LoginInsta extends BasePage
{
	@FindBy(name="username") private WebElement username;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
	
	public LoginInsta(WebDriver driver)
	{
		super(driver);
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

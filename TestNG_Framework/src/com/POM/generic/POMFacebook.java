package com.POM.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFacebook 
{
	@FindBy(id = "email")
	private WebElement UName;
	
	@FindBy(name = "pass")
	private WebElement Pwd;
	
	@FindBy(name = "login")
	private WebElement loginBtn;
	
	public POMFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String un)
	{
		UName.sendKeys(un);
	}
	
	public void password(String pwd)
	{
		Pwd.sendKeys(pwd);
	}
	
	public void login()
	{
		loginBtn.click();
	}

}

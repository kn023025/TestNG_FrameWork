package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.BasePage;

public class LogoutInsta extends BasePage
{
	@FindBy(xpath="//span[text()='More']") private WebElement more;
	@FindBy(xpath="//span[text()='Log out']") private WebElement logout;
	
	public LogoutInsta(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickMore()
	{
		more.click();
	}
	public void clickLogout()
	{
		logout.click();
	}

}

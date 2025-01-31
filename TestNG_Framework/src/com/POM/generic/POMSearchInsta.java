package com.POM.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMSearchInsta 
{
	@FindBy(xpath="//span[text()='Search']") private WebElement search;
	@FindBy(xpath="//input[@aria-label='Search input']") private WebElement searchText;
	@FindBy(xpath="//span[text()='drrajsongs']") private WebElement searchResult;
	@FindBy(xpath="//div[text()='Follow']") private WebElement follow;
	
	public POMSearchInsta(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchClick()
	{
		search.click();
	}
	
	public void SearchPassData(String data)
	{
		searchText.sendKeys(data);
	}
	
	public void searchResultClick()
	{
		searchResult.click();
	}
	public void followClick()
	{
		follow.click();
	}
	

}

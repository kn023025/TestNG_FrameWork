package com.runner;

import org.testng.annotations.Test;

import com.POM.LoginInsta;
import com.POM.LogoutInsta;
import com.generic.TestNG_Insta;

public class TestNG_POM_Runner extends TestNG_Insta
{
	@Test
	public void Login()
	{
		LoginInsta login = new LoginInsta(driver);
		login.username("kavitha.narendra2704@gmail.com");
		login.password("");
		login.login();
		
		LogoutInsta logout = new LogoutInsta(driver);
		logout.clickMore();
		logout.clickLogout();
	}

}

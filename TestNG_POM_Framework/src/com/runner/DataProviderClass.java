package com.runner;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="testdata")
	public Object[][] data()
	{
		Object [][] d = {{"Kavitha","Kavi@123","Kavi@123","test@gmail.com","https://www.google.com","123","456","12as","123456","1234",
			"kavitha","6","6","7"}};
		return d;
	};

}

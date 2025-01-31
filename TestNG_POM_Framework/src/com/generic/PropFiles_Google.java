package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropFiles_Google 
{
	@Test
	public static String testBaseUrl() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		String url = p.getProperty("BaseUrl");
		return url;
	}
	
	@Test
	public static String testDataKey() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		String key = p.getProperty("Key1");
		return key;
	}
	
	@Test
	public static String testDataValue() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		String value = p.getProperty("Value1");
		return value;
	}

}

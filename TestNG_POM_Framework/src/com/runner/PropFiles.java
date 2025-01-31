package com.runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

@Test(groups= {"Sanity"})
public class PropFiles {

	@Test
	public void testData() throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./data.properties"));
		String url = p.getProperty("BaseUrl");
		System.out.println(url);
	}
	
//generic
//	@Test
//	public void testData1(String path, String url) throws FileNotFoundException, IOException
//	{
//		Properties p = new Properties();
//		p.load(new FileInputStream(path));
//		String url1 = p.getProperty(url);
//		System.out.println(url1);
//	}
}

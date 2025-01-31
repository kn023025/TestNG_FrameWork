package com.runner;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups= {"Functional"})
public class Group_Demo 
{
	
	@Test(groups= {"smoke"})
	   public void test1()
	   {
		   System.out.println("this is test1");   
	   }
	   
	   @Test(groups= {"smoke", "regression"})
	   public void test2()
	   {
		   System.out.println("this is test2"); 
	   }
	   
	   @Test(groups= {"smoke"})
	   public void test3()
	   {
		   System.out.println("this is test3");   
	   }
	   
	   @Test(groups= {"regression"})
	   public void test4()
	   {
		   System.out.println("this is test4"); 
	   }

}

package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
   @Test
   public void test1()
   {
	   Reporter.log("Selenium");   //prints in report
   }
   
   @Test
   public void test2()
   {
	   Reporter.log("Grid", true); //prints both in console and reports
   }
}

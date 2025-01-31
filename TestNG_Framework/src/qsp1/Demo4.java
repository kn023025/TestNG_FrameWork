package qsp1;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
   @Test
   public void test1()
   {
	   Reporter.log("Selenium qsp1");   //prints in report
   }
   
   @Test
   public void test2()
   {
	   Reporter.log("Grid qsp1", true); //prints both in console and reports
   }
}
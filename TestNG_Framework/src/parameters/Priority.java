package parameters;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority = 1)
	public void test1()
	{
		Reporter.log("Selenium", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Grid", true);
	}

}

package com.generic;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRep 
{
	@Test
	public void extendReport()
	{
		ExtentReports rep = new ExtentReports("./report/ex1.html",false);
		ExtentTest test = rep.startTest("LoginReport");
		test.log(LogStatus.PASS, "tc exe pass");
		test.log(LogStatus.FAIL, "tc exe fail");
		test.log(LogStatus.SKIP, "tc exe skipped");
		rep.endTest(test);
		rep.flush();
	}

}

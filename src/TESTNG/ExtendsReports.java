package TESTNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReports {
  //create a report object
	ExtentReports reports= new ExtentReports();
 //creating the report	
	ExtentTest test = reports.createTest("dem");
	ExtentHtmlReporter rep = new ExtentHtmlReporter("C:\\Users\\Bhagyashree\\eclipse-workspace\\Selenium\\ReportFolder\\Report.html");
	
	@Test
	public void demo() throws IOException
	{
		//storing the test report in the given path
	
		//setting the document details 
				
		rep.config().setDocumentTitle("Automation");
		rep.config().setReportName("Testing");
		rep.config().setTheme(Theme.DARK);
		test.addScreenCaptureFromPath("C:\\Users\\Bhagyashree\\Pictures\\Saved Pictures\\Capture1.png");
		
		
		//settings the system information
		reports.attachReporter(rep);
		reports.setSystemInfo("hostname", "siri");
		reports.setSystemInfo("envname", "windows");
		reports.setSystemInfo("project name", "Demoproject");
		//Assert.fail();
	}
	
	@AfterMethod
	public void aftertest(ITestResult r) {
		System.out.println(r.getMethod().getMethodName());
		System.out.println(r.getStatus());
		if(r.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test is passed");
			reports.flush();
		}else
		{
			test.log(Status.FAIL, "test is failed");
			reports.flush();
		}
		
		
		
		
	}
	
	
}

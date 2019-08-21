package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	static ExtentHtmlReporter htmlReporter;
	
	static ExtentReports extent ;
	static ExtentTest test;
	WebDriver driver;
	
	
  @BeforeSuite
  public void Bsuite() {
	  
	  htmlReporter = new Exte
	  
  }
}

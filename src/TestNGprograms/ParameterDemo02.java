package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo02 {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	WebDriver driver;
	@Parameters({"browser" ,"Chrome" , "firefox"})
	@BeforeMethod
  @Test
  
  public void  OpenBrowser(String browser) {
		if(browser.equalsIgnoreCase("firefox"))
	  {
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  }
    
  
	  else if(browser.equalsIgnoreCase("chrome"))
  {
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
  }
  }
	
  
  @org.testng.annotations.Test
  
  public void text()
  {
	  Reporter.log("from test");
  }
  @AfterMethod
  public void closeBrowser()
  {
	  Reporter.log("close test");
  }
}

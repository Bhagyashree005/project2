package TestNGprograms;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
  @Test
  public void test1() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.actitime.com");
	  String actual = driver.getTitle();
	  String expected = "invalid";
	  Assert.assertEquals(actual, expected);
	  driver.close();
	  
  }
  @Test
  public void test2()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.actitime.com"); 
	  String actual = driver.getTitle();
	  String expected = "invalid";
	  SoftAssert s = new SoftAssert();
	  s.assertEquals(actual, expected);
	  driver.close();
	  s.assertAll();
	
  }
  
  
  
  
  
}

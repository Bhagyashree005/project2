package TestNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Basicexample {
WebDriver driver;
static {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	}

//  @Test(priority=1)
//  public void verifyclick() throws InterruptedException {
//	  driver.findElement(By.xpath("//li[@class='topnav_item livingunit']")).click();;
//		Thread.sleep(1000);
	 //driver.findElements(By.xpath("//li[@class='topnav_item livingunit']/div/descendant:: span"));
		 //Thread.sleep(500); 
  //}
  @Test //(priority=2)
  public void VerifyTest()
  {
	 WebElement  actual = driver.findElement(By.xpath("//input[@type='search']"));
	  WebElement expected = driver.findElement(By.xpath("//input[@type='search']"));
	 assertEquals(actual, expected);
	 driver.close();
	  
  }
  @BeforeTest
  public void beforeTest() {
	   driver = new ChromeDriver();
	  driver.get("http://urbanladder.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

    
  }



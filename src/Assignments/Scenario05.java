package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario05 {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	WebDriver driver;
	@BeforeMethod
	public void LaunchURL() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get(" https://www.facebook.com");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
//  @Test(priority=2)
//  public void SelectPrice() throws InterruptedException
//  {
//	  driver.findElement(By.xpath("//a[@title='Rings']")).click();
//	  
//	  driver.findElement(By.xpath("//span[text()='Price']")).click();;
//	  Thread.sleep(1000);
//	  WebElement list = driver.findElement(By.xpath("//span[text()= Popular']"));
//	  Select sel = new Select(list);
//	  sel.selectByVisibleText("Discount");
//	  
//  }
  
  @Test //(priority=1)
	//* Scenario==10
	  public void VerifyChatbox() throws InterruptedException
	  {
		
		  driver.findElement(By.xpath("//p[text()='CHAT with our experts !']")).click();
		  driver.findElement(By.id("name")).sendKeys("Siri");;
		  driver.findElement(By.id("email")).sendKeys("Siri@gmail.com");
		  driver.findElement(By.id("name")).sendKeys("Siri"); //code need to be edited
		  
		  
		  driver.findElement(By.xpath("//span[text()='Start the chat']")).submit();
		  // send message to chat box  & print reply in output 
		 
		  
	  }

  
  
}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test0010 {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	WebDriver driver;
  @Test
  public void VerifyChatbox() throws InterruptedException
  {
	driver = new ChromeDriver();
	driver.get(" https://www.bluestone.com/");
	driver.manage().window().maximize();
     Thread.sleep(3000);
	
//	  driver.findElement(By.xpath("//p[text()='CHAT with our experts !']")).click();
//	  driver.findElement(By.id("name")).sendKeys("Siri");;
//	  driver.findElement(By.id("email")).sendKeys("Siri@gmail.com");
//	  driver.findElement(By.id("name")).sendKeys("Siri"); //code need to be edited
//	  
//	  
	  driver.findElement(By.xpath("//span[text()='Start the chat']")).submit();
	  // send message to chat box  & print reply in output 
	 
	  
  }
}

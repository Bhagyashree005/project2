package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario07 {
WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	@BeforeMethod 
	public void Opensite() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		 Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@title='Jewellery']")).click();
//		  driver.findElement(By.xpath("//span[text()='Kadas']")).click();;
//		  WebElement lief = driver.findElement(By.xpath("//span[text()='Kadas']"));
	}
  @Test(priority=7)
  public void VerifyBluestone() {//throws InterruptedException {
	  driver.findElement(By.xpath("//div[@id='content-column']//div//li")).click();
  }
  
  @Test(priority=1) // */  Scenario==8
  public void verifyBanglesize()
  {
	  driver.findElement(By.xpath("//div[@id='content-column']//div//li")).click();
	  WebElement lief = driver.findElement(By.xpath("//span[text()='Select Size']"));
	  Select sel =new Select(lief);
	  sel.selectByIndex(03);
	  driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	  //capture the size of select image n compare with selected size
  }
  
  @Test(priority=5) //* Scenario==10
  public void VerifyChatbox()
  {
	  driver.findElement(By.xpath("//p[text()='CHAT with our experts !']")).click();
	  driver.findElement(By.id("name")).sendKeys("Siri");;
	  driver.findElement(By.id("email")).sendKeys("Siri@gmail.com");
	  driver.findElement(By.id("name")).sendKeys("Siri"); //code need to be edited
	  
	  
	  driver.findElement(By.xpath("//span[text()='Start the chat']")).submit();
	  // send message to chat box  & print reply in output 
	 
	  
  }
  
  @Test(priority=2) //0% off Scenaio==11
  public void verifyOffers()
  {
	  driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']")).click();
	  driver.findElement(By.xpath("//span[text()='Flat 5% Off']")).click();
  }
  @Test(priority=3) //50% off--- Scenario==12
  public void verify50()
  {
	  driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']")).click();
	  driver.findElement(By.xpath("//span[text()='Flat 5% Off']")).click();
  }
  
  @Test(priority=4) //50% off--- Scenario==13
  public void verify75()
  {
	  driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']")).click();
	  driver.findElement(By.xpath("//span[text()='Flat 5% Off']")).click();
  }
  
  
  
  @AfterMethod
  public void close()
  
  {
	  driver.quit();
  }
  
  
}

package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenariofrom014 {
WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	@BeforeMethod 
	public void Opensite() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@title='Jewellery']")).click();;
		 
		 	 
	}
  @Test(priority=2) // select 1 Gm Gold *** search elements not found
  public void VerifyGoldCoind() throws InterruptedException {
	  //driver.findElement(By.xpath("//li[@id='goldCoins']")).click();
	  WebElement gold = driver.findElement(By.xpath("//li[@id='goldCoins']"));
	  gold.click();
	  Thread.sleep(1000);
	  Select gm = new Select(gold);
	  gm.selectByVisibleText("Plain Gold Coins");
	  Thread.sleep(3000);
	 
  }
  
  
  @Test(priority=1) //Scenario 25th 
  public void VerifyCountGender() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@title='Rings']")).click();
	WebElement gender = driver.findElement(By.xpath("//span[text()='Gender']"));
	  gender.click();
	  Thread.sleep(1000);
	  Select sel = new Select(gender);
	  sel.selectByValue("M");
	  sel.selectByVisibleText("Women");
	 //sel.selectByIndex("01");
	  
	  Thread.sleep(3000);
  }
  
  @Test(priority=4) // Scenario 27th & 28th, 29th
  public void TestScheme() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Plan']")).click();;
	  driver.findElement(By.xpath("//input[@value='Start Now']")).click();;
	  // error popup to be verified with asserts using actual n expected 
	  
	  Thread.sleep(1000);
	  driver.findElement(By.id("amount")).sendKeys("10000");
	  driver.findElement(By.id("Email")).sendKeys("Siri@gmail.com");
	  Thread.sleep(2000);
  }
  
  @Test(priority=3) // Scenario 32 --completed
  public void visitstores() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
	 // WebElement print = (WebElement) driver.findElements(By.xpath("//div[@class='store-location']"));
	  
	  Thread.sleep(3000);
	  List<WebElement> itemlist = driver.findElements(By.xpath("//div[@class='store-location']"));
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    for(int i=0;i<=20;i++)
	    {
	    	js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(1000);
	    

		}
	    for(WebElement print : itemlist)
	    {
	    	System.out.println(print.getText());
	    	Thread.sleep(1000);
	    }
	    

  }
  @AfterMethod 
  public void closing()
  
  {
	  driver.quit();
  }
}

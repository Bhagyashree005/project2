package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Trial {
WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	@BeforeMethod 
	public void Opensite() throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[@title='Jewellery']")).click();;
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//span[text()='Kadas']")).click();;
		  WebElement lief = driver.findElement(By.xpath("//span[text()='Kadas']"));
	}

	
  @Test
  public void f() {
  }
}

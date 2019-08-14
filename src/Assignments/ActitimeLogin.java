package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://demo.actitime.com");
   try
   {
   driver.findElement(By.name("username")).sendKeys("admin");;
   driver.findElement(By.name("pwd")).sendKeys("12345");
   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
   }
   
   catch(Exception e){
	   
   }
   finally 
   {
	  //.findElement(By.name("pwd")).clear();
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
   }
	}

}

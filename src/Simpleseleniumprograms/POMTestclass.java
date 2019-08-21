package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTestclass {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://demo.actitime.com");
    POMclassDemoPage  l = new POMclassDemoPage (driver);
   //pageFactory.initElements(driver,l);
   
   l.setUserName("admin");
   l.setPassword("123345");
		
   l.clickLogin();
		Thread.sleep(1000);
		
		l.setUserName("admin");
		l.setPassword("manager");
		
		l.clickLogin();
		
		
	}

}

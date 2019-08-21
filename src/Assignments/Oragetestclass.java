package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oragetestclass {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(1000);
   			driver.findElement(By.id("txtUsername"));
   			driver.findElement(By.id("txtPassword"));
   			driver.findElement(By.name("btnLogin"));
   			
   			OrangeHRMPage login =new OrangeHRMPage(driver);
             login.user("Admin");
             login.password("1234");
             Thread.sleep(1000);
             login.user("Admin");
             login.password("manager");
	}

}

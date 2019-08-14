package Simpleseleniumprograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02Selenium {
static {
   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
   }
		
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Google.com");
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		//WebElement send = driver.switchTo().activeElement();
		//send ="  "
//*************************
		
		//driver.get("http://naukri.com");
		//Set <String> whs = driver.getWindowHandles();
		//System.out.println("number of windows:" +whs.size());

//****getscreenshot
		
	}
	

}

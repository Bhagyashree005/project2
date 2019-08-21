package Simpleseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	static {
		   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		   }
			
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.SeleniumHq/Downloads.com");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
 driver.findElement(By.xpath("//td[Java]../td[2]")).click();
	}

}

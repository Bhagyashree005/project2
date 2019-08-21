package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYpracticeprogram {

		static {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			}
		
		public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.cssSelector(" //input[@tpe='search']")).sendKeys("Dining table");

	}

}

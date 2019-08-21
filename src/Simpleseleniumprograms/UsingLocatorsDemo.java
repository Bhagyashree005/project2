package Simpleseleniumprograms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorsDemo {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Gmail.com");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//***using css selector 
		//Login page of Gmail:
		
		driver.findElement(By.cssSelector("input[type ='email']")).sendKeys("bhagyashree.k@testyantra.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Testmailbox99");
        driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		// For forgot password 
        driver.findElement(By.id("forgotPassword")).click();
		
	}

}

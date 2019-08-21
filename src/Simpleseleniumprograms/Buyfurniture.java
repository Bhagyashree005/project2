package Simpleseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buyfurniture {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.urbanladder.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//** for closing the popup
		driver.findElement(By.cssSelector("a[class='close-reveal-modal hide-mobile']")).click();
		
		//Thread.sleep(1000);
		//driver.findElements(By.xpath("//Div[@class='navigation_wrapper']/ul/li[4]"));
		//System.out.println(driver.findElements(By.xpath("//Div[@class='navigation_wrapper']/ul/li/div")));
	    
		driver.findElement(By.xpath("//Div[@class='topnav_wrapper']/ul/li")).click();
		Thread.sleep(2000);
		
		//to input in search field
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("sofa set");
		

	}

}

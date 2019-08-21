package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTestclass {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://flipkart.com");
    Thread.sleep(1000);
   		driver.findElements(By.xpath("//div[@id='container']/div/descendant ::img"));
   	//List<WebElement> count = driver.findElements(By.xpath("//div[@id='container']/div/descendant ::img"));
   		//System.out.println(count.size());
   		POMflipkartPage p = new POMflipkartPage(driver);
   		//p.imgsize();
   		System.out.println(p.imgsize());
   		
   		
   		
   		
	}

}

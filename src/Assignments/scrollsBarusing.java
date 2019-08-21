package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollsBarusing {


		static {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			}
		
		public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("http://www.urbanladder.com");
        driver.findElement(By.xpath("//span[@class='topnav_itemname']")).click();;
       // System.out.println();
       // Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='taxonslist']descendant::a[7]")).click();;
	}

}

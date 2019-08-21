package Simpleseleniumprograms;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

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
		Thread.sleep(1000);
		WebElement itemlist = driver.findElement(By.xpath("//ul[@class='topnav bodytext']"));
		Thread.sleep(500);
		WebElement move = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
    	Actions ac = new Actions(driver); // to mouseover on the items 
        ac.moveToElement(move).perform();
        Thread.sleep(1000);

        String p = itemlist.getText();
        System.out.println(p);
		 String  s = move.getText();
       	  System.out.println(s); // this prints living items list 
       	  
       	
       	  
       	  
	}
}

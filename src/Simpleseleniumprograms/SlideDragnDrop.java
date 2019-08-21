package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideDragnDrop {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://jqueryui.com/slider/");
   driver.switchTo().frame(driver.findElement(By.className("demo-frame"))) ;
    
    Actions ac = new Actions(driver);
    WebElement slide = driver.findElement((By.xpath("//div[@id='slider']/span")));
    for(int i=0; i<30;i++)
    {
    	ac.moveToElement(slide).clickAndHold(slide).moveByOffset(i, 0).perform();
    }
    for(int i=30;i>0;i--)
    {
    	ac.moveToElement(slide).clickAndHold(slide).moveByOffset(-i, 0).perform();
    }
    
    
    
    //thread.slee
    //driver.close();
    
	}

}

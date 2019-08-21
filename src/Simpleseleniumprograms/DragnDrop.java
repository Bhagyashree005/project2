package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Drag n Drop 
    WebElement source = driver.findElement(By.xpath("//h1[.='Block 2']"));
    WebElement dest = driver.findElement(By.xpath("//h1[.='Block 3']"));
    Actions ac= new Actions(driver);
    Thread.sleep(1000);
    
    ac.dragAndDrop(source, dest).perform();;  // method to use drang n drop
	}

}

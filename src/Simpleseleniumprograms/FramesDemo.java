package Simpleseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("file:///C:/Users/Bhagyashree/Desktop/Java/frame.html");
    WebElement t1 = driver.findElement(By.id("t1"));
    Thread.sleep(1000);
    t1.sendKeys("Testyantra");
    
    driver.switchTo().frame(driver.findElement(By.id("f1")));
    
    WebElement t2 =driver.findElement(By.id("t2"));
    Thread.sleep(1000);
    t2.sendKeys("TY");
 
    driver.switchTo().parentFrame();  // switch to immediate parent frame 
    //driver.switchTo().defaultContent(); switch to descendant to grand parent 
    
    Thread.sleep(1000);
    t1.clear();
    Thread.sleep(1000);
    t1.sendKeys("software");
    
  //  driver.switchTo().frame(driver.findElement(arg0))
    }

}

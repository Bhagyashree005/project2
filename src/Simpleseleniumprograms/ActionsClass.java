package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("http://www.vtiger.com");
WebElement p =driver.findElement(By.xpath("//a[text() ='Resources']"));
Actions action = new Actions(driver);
Thread.sleep(1000);
action.moveToElement(p).perform();
driver.findElement(By.xpath("//a[text()='Contact']")).click();
WebElement p1 = driver.findElement(By.xpath("//div[text()='Human Resource']/parent::div/div[@class='col-md-8 col-sm-8']"));
String text = p1.getText();
System.out.println(text);


	}

}

package Simpleseleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentwaitDemo {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
//implicit wait exception - if its not given no such element found exception occurs 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("http://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();


FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
wait.pollingEvery(Duration.ofMillis(600)).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
driver.findElement(By.id("logoutLink")).click();
	}

}

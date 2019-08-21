package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeDemoofPopup {

	
		static {
		      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//driver.get("https://retail.starhealth.in/renewal");
	//driver.findElement(By.cssSelector("input[id = 'dtDOB']")).click();
	//driver.findElement(By.xpath("//div[id ='datepicker']/u")).click();; // 
	//driver.findElement(By.xpath("//a[text()='1']")).click();;
	
	
	//Java script popup Demo 
	driver.get("https://demo.guru99.com/v1/index.php");
	driver.findElement(By.name("btnLogin")).submit();
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert = driver.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	alert.accept();
	

	}

}

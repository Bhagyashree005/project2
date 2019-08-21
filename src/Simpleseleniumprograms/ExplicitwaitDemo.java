package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
//implicit wait exception - if its not given no such element found exception occurs 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();


//for login
driver.get("http://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

//xpath("//div[text()='Login']"))
//explicit condition :
//WebElement logout = driver.findElement(By.id("logoutLink"));
//WebDriverWait wait = new WebDriverWait(driver,10);
//wait.until(ExpectedConditions.elementToBeClickable(logout));
//driver.findElement(By.id("logoutLink")).click();


//** fluent wait ************
//while(true)
//{
//	try
//	{
//		driver.findElement(By.linkText("Logout")).click();
//		System.out.println("logout successfully");
//		break;
//	}
//
//catch(Exception e)
//	{
//		System.out.println("exception caught");
//	}
//	driver.close();

//*** Custom wait 
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(new ExpectedCondition<WebElement>() {
	@Override
	public WebElement apply(WebDriver d) {
		return d.findElement(By.linkText("Logout"));
	}
});
driver.findElement(By.linkText("Logout")).click();
	}
	
}



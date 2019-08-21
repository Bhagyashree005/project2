package Simpleseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	private static final String Webelement = null;
	static 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("DemoShree");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.name("reg_email__")).sendKeys("bgkatapur@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bgkatapur@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Forgotpassword@99");		
		Thread.sleep(1000);
		driver.findElement(By.id("Day")).click();
        
		WebElement drp = driver.findElement(By.name("birthday_day"));
				drp.click();
		Select sel = new Select(drp);
		sel.selectByValue("14");
	}

}

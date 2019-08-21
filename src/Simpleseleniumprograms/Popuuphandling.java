package Simpleseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuuphandling {
		static {
		      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://demoactitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	
	driver.findElement(By.xpath("//div[@class='topMenuButton preventpanelHiding'][2]")).click();
	driver.findElement(By.xpath("//div[@class ='popup_menu_ul']/descendant :: a[contains(.,About')]")).click();
	driver.findElement(By.xpath("//div[@id='aboutpopup']/descendant::td[@class='close-button']")).click();
	

	}

}

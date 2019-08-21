package Simpleseleniumprograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {

	static {
	      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	}
	
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://naukri.com");
Set<String> ref = driver.getWindowHandles();
int count =ref.size();
//	for( String sw : ref)
//	{
//	
//	driver.switchTo().window(sw);
//	System.out.println(driver.getTitle());
//	driver.close();






	
}
}

package Simpleseleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbarsHandling {

	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("http://www.urbanladder.com");
       //javascript command 
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    for(int i=0;i<=10;i++)
    {
    	js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(1000);
    

	}
    //js.executeScript("window.scrollBy(0,500)");
    
    for(int i=10;i>=10;i--)
    {
    	js.executeScript("window.scrollBy(0,500)");
   // Thread.sleep(1000);

	}

    
    
    
    
	}

}
